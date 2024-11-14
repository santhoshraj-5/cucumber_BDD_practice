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
Feature: scenario outline practice
  I want to use this template for my feature file

  #Scenario Outline: Title of your scenario outline
  #Given I want to write a step with <name>
  #When I check for the <value> in step
  #Then I verify the <status> in step
  @sanity
  Scenario Outline: login and click a product
    Given user navigated to the demo blazer site
    And user  cliked login and enters "<username>" and "<password>"
    When user click any <product>
    Then product page <url> should come

    #in cucumber it takes number as int but we need to send that as string so use "" in eaither outline or in example
    Examples: 
      | username      | password  | product             | url                                          |
      | santasanthosh | santa@123 | "Samsung galaxy s6" | "https://www.demoblaze.com/prod.html?idp_=1" |
      | santasanthosh | santa@123 | "Nokia lumia 1520"   | "https://www.demoblaze.com/prod.html?idp_=2" |
