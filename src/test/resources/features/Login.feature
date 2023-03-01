Feature: Application Login

  Scenario: Home page default Login
    Given User is on Netbanking Landing Page
    When User Login into Apllication ith username "Jin" and password "123"
    Then Home page is populated
    And Cards Displayed are "true"
    
  Scenario: Home page default Login
    Given User is on Netbanking Landing Page
    When User Login into Apllication ith username "John" and password "456"
    Then Home page is populated
    And Cards Displayed are "false"
    