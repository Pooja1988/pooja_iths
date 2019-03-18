Feature: managing pets in the petstore

  Scenario: Delete a pet
    Given a pet with id 459872345
    When i delete the pet with id 459872345
    Then I get error fetching the pet with id 459872345

Scenario: Create a pet
  When I create a pet with id 123456
  Then I can get the pet with id 123456


  Scenario: Create a pet
    Given the following pets

    |id |name | status|
    |  123 | olle |avaialbale|
    |   456   | Bengt   | available  |
    Then I can get the pet with id
  
  Scenario: Create a pet and fetch it by status
    Given  A pet with status "sold" and id 345677
    When I fetch pets by status "sold"
    Then a pet with id 345677 will be in the response
  
Scenario Outline:
  Given a vehicle with brand"<brand>", new price"<new price>", condition"<condition>" etc
  Then the price of the vehicle should be<currentPrice>

  Examples: |brand |newPrice|condition|
            | Volvo  |40000  |Good  |
            |    BMW    |   2000000    | Excellent|