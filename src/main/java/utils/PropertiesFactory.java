package utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFactory {

    private static Properties properties;
    private final String propertyFilePath = "src/main/resources/config.properties";


    public PropertiesFactory() {
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader(propertyFilePath));
            properties = new Properties();
            properties.load(reader);
            reader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public String getKey() {
        return properties.getProperty("key");
    }

    public String getToken() {
        return properties.getProperty("token");
    }

    public String getBaseUri() {
        return properties.getProperty("baseUri");
    }
}
