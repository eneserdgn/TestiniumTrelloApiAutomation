package endpoints;

import io.restassured.response.Response;
import payloads.Card.CreateACard;
import utils.RequestSpecificationFactory;

public class CardEndPoints {
    public static String createACard = "cards";
    public static String updateACard = "cards/{id}";
    public static String deleteACard = "cards/{id}";


    public static Response CreateACard(CreateACard payload) {
        return RequestSpecificationFactory.getRequestSpecification()
                .body(payload)
                .when()
                .post(createACard);
    }

    public static Response UpdateACard(CreateACard payload, String id) {
        return RequestSpecificationFactory.getRequestSpecification()
                .pathParam("id", id)
                .body(payload)
                .when()
                .put(updateACard);
    }

    public static Response DeleteACard(String id) {
        return RequestSpecificationFactory.getRequestSpecification()
                .pathParam("id", id)
                .when()
                .delete(deleteACard);
    }
}
