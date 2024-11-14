#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
Feature: login user story with parameter

  #I want to use this template for my feature file
  #@tag1
  @smoke
  Scenario: login postive scenario
    Given user navigated to the demo blazer site
    And user clicks the header login button
    And user enters username as "santasanthosh"
    And user enters password as "santa@123"
    When user click login
    Then user should be succefully loged in
@reg
  Scenario: login negative scenario
    Given user navigated to the demo blazer site
    And user clicks the header login button
    And user enters username as "santasan"
    And user enters password as "santa@123" 
    When user click login
    But user should not loged in
#we can use given also here and is for readablity