#Author: phetomalope@gmail.com
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
      
Feature: annotation 
#This is how background can be used to eliminate duplicate steps 

	Background: 
	   User navigates to Facebook Given 
	   I am on Facebook login page

	#Scenario with AND 
	Scenario: 
	   When I enter username as "dummy-user"
	   And I enter password as "dummy-password" 
	   Then Login should fail 
	
	#Scenario with BUT 
	Scenario: 
	   When I enter username as "dummy-user"
	   And I enter password as "dummy-password"
	   Then Login should fail 
	   But Relogin option should be available