@FirstFeature
Feature: User can update number of guests on Landing page
  Scenario: Verify user can update number of guests on Landing page
    Given I am on Hotels Homepage
    When I click on Guests button on Homepage
    And I add '2' Adults
    And I add '2' Children
    And I select age for child number '1' is '4'
    And I select age for child number '2' is '0'
    Then I verify that number of adults and children same as selected
    When I click on Apply on Room options
    Then I verify that total amount of guests is the same as selected in Guest rooms
