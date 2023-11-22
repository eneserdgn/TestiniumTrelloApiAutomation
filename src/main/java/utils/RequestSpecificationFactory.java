package utils;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

public class RequestSpecificationFactory {

    static ThreadLocal<RequestSpecification> threadLocal = new ThreadLocal();

    public static void init_RequestSpecification() {
        threadLocal.set(RestAssured.given());
    }

    public static RequestSpecification getRequestSpecification() {
        return threadLocal.get();
    }

}
