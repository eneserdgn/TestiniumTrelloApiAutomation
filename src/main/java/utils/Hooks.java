package utils;

import com.fasterxml.jackson.databind.annotation.JsonAppend;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.qameta.allure.Allure;
import io.restassured.http.ContentType;

public class Hooks {
    PropertiesFactory propertiesFactory = new PropertiesFactory();

    @Before
    public void before() {
        RequestSpecificationFactory.init_RequestSpecification();
        RequestSpecificationFactory.getRequestSpecification()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .queryParam("key", propertiesFactory.getKey())
                .queryParam("token", propertiesFactory.getToken())
                .baseUri(propertiesFactory.getBaseUri());
    }


}
