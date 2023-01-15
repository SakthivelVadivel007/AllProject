@reg
Feature: Adactin hotel Bokking Page functionality testing


  Scenario Outline: Adactin hotel Booking Page credintials testing
    When User should enter  "<firstName>" , "<lastName>", Billig "<address>", "<CreditCardNo>" and "<CVVNumber>"
    When User should Select CreditCardType
    When User should Select Expiry Date (month and year)
    When User should click booknow button
    Then user should verify order number
    And user  enter the logout button

    Examples:
     
      | firstName | lastName | address      | CreditCardNo     | CVVNumber |
      | sakthi    | vel      | omr,Karpakkm | 8989765432768976 |       789 |
