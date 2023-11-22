package endpoints;

import io.restassured.response.Response;
import payloads.Board.CreateABoard;
import utils.RequestSpecificationFactory;

public class BoardEndPoints {
    public static String createABoard = "boards";
    public static String deleteABoard = "boards/{id}";

    public static Response CreateABoard(CreateABoard payload) {
        return RequestSpecificationFactory.getRequestSpecification()
                .body(payload)
                .when()
                .post(createABoard);
    }

    public static Response DeleteABoard(String id) {
        return RequestSpecificationFactory.getRequestSpecification()
                .pathParam("id", id)
                .when()
                .delete(deleteABoard);
    }
}
