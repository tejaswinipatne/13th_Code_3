Feature: test page

Scenario Outline: verification

Given Open the Chrome and launch the application
When Enter the "<username>" and "<password>"
Then Login

Examples:
|username |password |
|tejaswini |123|