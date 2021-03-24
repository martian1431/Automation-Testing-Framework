#Author: phetomalope@gmail.com
      
Feature: annotation 
#This is how background can be used to eliminate duplicate steps 

	Background: 
	   User navigates to Facebook 
	   Given I am on Facebook login page

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