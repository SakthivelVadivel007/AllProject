
Feature: Adactin hotel functionality testing
@Smoke
  Scenario: Adactin hotel credintials testing
    Given User should open the chrome browser
    When user  is on the Adactin hotel login page
   
    When User should enter valid "<username>"  and "<password>"
    And User should enter the login button
    Then User should navigate to search hotel page
    
    Examples:
    
    |username        |password|
    |sakthivelvadivel|3CKGE8|

@Smoke
  Scenario: Adactin hotel credintials testing
    Given User should open the chrome browser
    When user  is on the Adactin hotel login page
   
    When User should enter valid "<username>"  and "<password>"
    And User should enter the login button
    Then User should navigate to search hotel page
    
    Examples:
    
    |username        |password|
    |sakthivelvadivel|3CKGE8|

 Scenario Outline: Adactin hotel Search credintials testing
    Given User is on the Adactin Search hotel login page
    When User select the valid Location
    When User select the valid  Hotels
    When User select the valid Room Type
    When User select the valid Room Type
    When User select the valid Number of Rooms
    When User select the validAdults per Room
    When User select the valid Children per Room
    And User enter the valid "<CheckInDate>" and "<CheckOutDate>"
    When User  enter the search button
    Then User should navigate the success massage

    Examples: 
      | CheckInDate | CheckOutDate |
      | 18/12/2022    | 19/12/2022 |

      
     
      Scenario Outline: Adactin hotel Select credintials testing
      Given User is on the Adactin hotel Select  page
      When User should click radio button
      When User should enter continue button
      
      
      
     