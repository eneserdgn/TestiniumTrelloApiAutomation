Feature: Trello API Test Suite

  Scenario: Interview Test on Trello
    Given User creates "Trello" board
    When User add "In Test" list to the board
    When User adds "LoginPage - User cannot login" and "ProductPage - User cannot select quantity" cards to the board
    When User updates a random card from the created ones
    When User deletes the created cards
    When User deletes the created board
