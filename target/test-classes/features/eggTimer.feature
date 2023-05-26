Feature: To test EggTimer Site

  Scenario Outline: To verify time expired message shown on finish of timelapse when a timer is selected
    Given read the browser from properties file
    And read the url from properties file and navigates
    Then verify that the page gets loaded
    When user enters "<Time>" in the textbox
    And clicks on start button
    Then verify user is able to see the alert when "<Time>" is reached
    Examples:
      | Time |
      |5 sec |


