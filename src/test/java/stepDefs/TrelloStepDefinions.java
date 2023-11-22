package stepDefs;

import endpoints.BoardEndPoints;
import endpoints.CardEndPoints;
import endpoints.ListEndPoints;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import payloads.Board.CreateABoard;
import payloads.Card.CreateACard;
import payloads.Lists.CreateAList;

import java.util.Random;

public class TrelloStepDefinions {
    String boardId;
    String listId;
    String card1;
    String card2;

    @Given("User creates {string} board")
    public void userCreatesABoard(String boardName) {
        CreateABoard createABoard = new CreateABoard();
        createABoard.setName(boardName);
        createABoard.setDesc("Board Description");
        boardId = BoardEndPoints.CreateABoard(createABoard).path("id");
    }

    @When("User add {string} list to the board")
    public void userAddAListToTheBoard(String listName) {
        CreateAList createAList = new CreateAList();
        createAList.setName(listName);
        createAList.setIdBoard(boardId);
        listId = ListEndPoints.CreateAList(createAList).path("id");
    }

    @When("User adds {string} and {string} cards to the board")
    public void userAddsTwoCardsToTheBoard(String cardName1, String cardName2) {
        CreateACard createACard1 = new CreateACard();
        createACard1.setName(cardName1);
        createACard1.setDesc("Desc");
        createACard1.setIdList(listId);
        CreateACard createACard2 = new CreateACard();
        createACard2.setName(cardName2);
        createACard2.setDesc("Desc");
        createACard2.setIdList(listId);
        card1 = CardEndPoints.CreateACard(createACard1).path("id");
        card2 = CardEndPoints.CreateACard(createACard2).path("id");
    }

    @When("User updates a random card from the created ones")
    public void userUpdatesARandomCardFromTheCreatedOnes() {
        CreateACard createACard = new CreateACard();
        createACard.setName("Updated Card");
        createACard.setDesc("Description");
        createACard.setIdList(listId);
        Random rnd = new Random();
        if (rnd.nextInt(5) % 2 == 1) {
            CardEndPoints.UpdateACard(createACard, card1);
        } else {
            CardEndPoints.UpdateACard(createACard, card2);
        }

    }

    @When("User deletes the created cards")
    public void userDeletesTheCreatedCards() {
        CardEndPoints.DeleteACard(card1);
        CardEndPoints.DeleteACard(card2);
    }

    @When("User deletes the created board")
    public void userDeletesTheCreatedBoard() {
        BoardEndPoints.DeleteABoard(boardId);
    }

}
