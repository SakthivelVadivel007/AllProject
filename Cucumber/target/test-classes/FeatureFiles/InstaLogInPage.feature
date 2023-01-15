Feature: Insagram functionality testing

  Scenario Outline: Instagram  credintials testing
    Given User is on the instagram login page
    When User should enter valid "<username>" and "<password>"
    And User should enter the login button
    Then User should verify the success massage

    Examples:
    |username|pssword|
    |sakthi|saktho@5678|
    |vell|vell788|
    |murugan|murugan256467|