Feature: Create Normal Campaign


Scenario Outline: Verification of normal Campaign


Given Open the Chrome and launch the application and Create Normal Campaign			


#When Enter the "<username>" and "<password>" 	

Then Go to Campaign

And Click on Pending Campaign

And Create Manual Campaign

When Enter the "<cname>" and "<desc>" 

Examples:
#|username|password|
#|tejaswini.patne@trigensoft.com|Tech@123|

|cname|desc|
|DemoCampaign|DemoPurposeCampaign|
