package endpoints;

import io.restassured.response.Response;
import payloads.Lists.CreateAList;
import utils.RequestSpecificationFactory;

public class ListEndPoints {
    public static String createAList = "lists";

    public static Response CreateAList(CreateAList payload) {
        return RequestSpecificationFactory.getRequestSpecification()
                .body(payload)
                .when()
                .post(createAList);
    }
}
