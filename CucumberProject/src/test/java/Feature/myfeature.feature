Feature: Reset functionality on login page of Application 


Scenario Outline: Verification of Reset button 


Given Open the Chrome and launch the application			


When Enter the "<Username>" and "<Password>" 			


Then Reset the credential

Examples:
|Username|Password|
|tejaswini.patne@trigensoft.com|Tech@123|