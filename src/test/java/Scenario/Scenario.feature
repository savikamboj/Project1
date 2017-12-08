Feature: Test my application

  Scenario: Login and create artifact
    Given Launch browser and enter url
    When Enter valid credential 
    Then Home Page displayed
    
    Scenario: Create Artifact
    Given:Click Artifact Sidemenu
    When: Click button
    Then: Enter form entries
    And: Click Save button
   