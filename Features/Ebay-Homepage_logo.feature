Feature: EBY homepage logo validation

# Update the feature-branch1.2

  Scenario: As a user I want to check that ebay logo is present
    Given I navigate to https://www.ebay.co.uk/
    Then I should see the EBY logo
    And close the browser

