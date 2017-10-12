Feature: Test Gmail Scenario

        Scenario: Test Login with valid credentials
          
          Given Open Firefox and start application
          When  I enter Valid username and password
          Then user should be able to login successfully  
          Then Check Functionality
          
        Scenario outline:
        
        Given web page is opened
        When we enter different sets of data
        Then for right data logins to page
        And for wrong data it will send an error 
        
        
        Scenario outline: login fail - wrong username
    Given user is on Application landing page
    When user clicks on Sign in button
    Then user is displayed login screen
    When user enters username as <username>
    And user enters password in <password>
    And user clicks Sign in button
    Then user gets login failed error message

  
       Examples:  
        
        <username>                         <password> 
        madishettymanibushan@gmail.com  | Madishetty105
        mani.bhushan666@gmail.com       | madishetty105