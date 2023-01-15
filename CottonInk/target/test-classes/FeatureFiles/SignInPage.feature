Feature: Cottenink signin functional testing

  Scenario Outline: Cottenink signin cridential testing
    Given user is on cottoink signin home page
    And user should move courser to signin icon
    When user should click signin in dropdown
    And user is navigte to signin/signup page
    And user should enter email address "<email>" and password "<password>"
    Then user should click signin button

    Examples: 
      | email                         | password   |
      | sakthivelvadivel007.gmail.com | 9092044860 |
