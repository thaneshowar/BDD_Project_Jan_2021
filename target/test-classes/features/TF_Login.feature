@otherFeature @smoke 
Feature: validate Techfios login functionality 

Background: 
#	Given User is on the techfios login page  
#	Given User is on the "techfios" login page  
	Given User is on the "techfios" login page 
@other1 
Scenario Outline: 1 User should be able to login with the valid credentials 
	When User enters "<username>" and "<password>" 
	And user click on signin button 
	Then user will land on the Dashboard Page 
	Examples: 
	
		|username|password|
		|demo@techfios.com|abc123|
#		|demo@techfios.com|abc124|
#		|demo2@techfios.com|abc123|
#		|demo2@techfios.com|abc124|
		
		#@other1 @smoke 
		#Scenario: 1  User should be able to login with the valid credentials 
		#When user enter username as "demo@techfios.com" 
		#When user enter username as "abc123" 
		#And user click on signin button 
		#Then user will land on the Dashboard Page 
		
		#@other2 
		#Scenario: 2 User should be able to login with the valid credentials 
		#	When user enter username as "demo@techfios.com" 
		#	When user enter username as "abc124" 
		#	And user click on signin button 
		#	Then user will land on the Dashboard Page 
		
		#@other3 
		#Scenario: 3 User should be able to login with the valid credentials 
		#	When  user enter username as "demo2@techfios.com" 
		#	When  user enter username as "abc123" 
		#	And  user click on signin button 
		#	Then  user will land on the Dashboard Page 
		
		#@other4 
		#Scenario: 4 User should be able to login with the valid credentials 
		#	When  user enter username as "demo2@techfios.com" 
		#	When  user enter username as "abc124" 
		#	And  user click on signin button 
		#	Then  user will land on the Dashboard Page 
		
	