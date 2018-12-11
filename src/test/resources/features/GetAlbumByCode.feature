Feature: Get Album by code
  Scenario: A user calls an api to get an album
    Given an album exists
    When a user retrieves the album by code 1
    Then the status code is 200
    And the response includes the following
    |title |quidem molestiae enim  |
    |id    |1                      |
