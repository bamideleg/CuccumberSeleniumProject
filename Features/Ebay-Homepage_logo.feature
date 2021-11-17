Feature: EBY homepage logo validation

# Work on the feature-branch 2.1 - check Ebay logo on the page

  Scenario: As a user I want to check that ebay logo is present
    Given I navigate to https://www.ebay.co.uk/
    Then I should see the EBY logo
    And close the browser


# Work on the feature-branch 2.1 - Add search functionality
  Scenario: As user I want to search for product
    Given I navigate to https://www.ebay.co.uk/
    When I enter product name as shirt
    Then system should display item_Count
    And close the browser2


