$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/Test2.feature");
formatter.feature({
  "line": 1,
  "name": "Test techconnectr",
  "description": "",
  "id": "test-techconnectr",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Login to the Techconnect",
  "description": "",
  "id": "test-techconnectr;login-to-the-techconnect",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "Open the Chrome browser",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Enter the username and password",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Login to the portal",
  "keyword": "Then "
});
});