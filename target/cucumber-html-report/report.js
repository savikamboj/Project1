$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Scenario.feature");
formatter.feature({
  "line": 1,
  "name": "Test my application",
  "description": "",
  "id": "test-my-application",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Login and create artifact",
  "description": "",
  "id": "test-my-application;login-and-create-artifact",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "Launch browser and enter url",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Enter valid credential",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "Home Page displayed and Click Artifact Sidemenu",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "Create artifact",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Close the application",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.launch_browser_and_enter_url()"
});
formatter.result({
  "duration": 20017902044,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.enter_valid_credential()"
});
formatter.result({
  "duration": 15796473131,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.home_Page_displayed_and_Click_Artifact_Sidemenu()"
});
formatter.result({
  "duration": 222511683,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.create_artifact()"
});
formatter.result({
  "duration": 19877858306,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.close_the_application()"
});
formatter.result({
  "duration": 745747179,
  "status": "passed"
});
});