Feature: EBY homepage logo validation


  Scenario: As a user I want to check that ebay logo is present
    Given I navigate to https://www.ebay.co.uk/
    Then I should see the EBY logo
    And close the browser

    # Commit logo feature file
