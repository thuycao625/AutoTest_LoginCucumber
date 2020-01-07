Feature: Login admin page


  Scenario Outline: Login travel admin website

    Given Open website <website>
    When I input username as <username> and password as <password>
    Then I click submit
    Then I verify system navigates to the dashboard page
    Examples:
      | website                             | username            | password |
      | http://localhost:8080/demo/#!/login | admin               | admin |