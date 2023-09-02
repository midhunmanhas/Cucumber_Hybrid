@regression
Feature: To Signin to the application
  As a user I want to sign in to the application

  Scenario: Login Page Title
    Given User is on the Home Page
    Then User navigates to the login page "Login - My Shop"
    Then User enters the email id "monicadevendiran7@gmail.com"
    Then User enters the password "monicad@8393"
    And User click on the signin button
    #When User gets the title of the page
#		Then User verifies the Page title
		
		
		#Gherkin keyword
		#Given ,When,And , Then