# https://www.youtube.com/watch?v=99qAnsYIYA0
# Cucumber DataDriven with Maps in Selenium - Part 5
# Create a Pull Request from IntelliJ
# https://www.youtube.com/watch?v=lcSXH23xrY8
#https://www.youtube.com/watch?v=u-YdIyV_apI
#Working with Git feature branches | Git Workflows



Feature: EBY multiple search using datatable

  Scenario: As a user I want to check that ebay logo is present
    Given that I on navigate to https://www.jobserve.com/gb/en/Job-Search/
    When I entered the jobType and Location
         | jobType     | location   |
         | BA Analyst  | London     |
         | Tester      | Manchester |
    And click on search submit button
    Then I should see the jobs in the location
    And close the browser5

  # code clean up is in progress#3.
  # code clean up is in progress#4.
  # code clean up is in progress#5.
  # code clean up is in progress#6.
  # code clean up is in progress#7.


