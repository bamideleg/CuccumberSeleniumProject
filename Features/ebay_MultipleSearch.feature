
# Author
# Date
# Description

#@SmokeScenario
Feature: job search functionality

  Background:
    Given user open https://www.jobserve.com/

  Scenario: As user I want to search for available jobs
  #  Given user open https://www.jobserve.com/
    When enter JobType and location
    And click on search button
    Then I should see the number of jobs available
    And close the browser3

  Scenario Outline: As user I want to search ofr available job
  #  Given user open https://www.jobserve.com/
    When enter "<JobType>" and "<location>"
    And click on search button
    Then I should see the number of jobs available
    And close the browser4

    Examples:
        | JobType    | location |
        | BA Analyst | London   |
        | Tester     | London   |