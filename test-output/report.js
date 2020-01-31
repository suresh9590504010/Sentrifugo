$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/kishan das/Desktop/TestNG/Final_Cucumber_BDD_POM/src/test/java/com/features/LoginPage.feature");
formatter.feature({
  "line": 1,
  "name": "OrangeHrm Login Test",
  "description": "",
  "id": "orangehrm-login-test",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Valide Login",
  "description": "",
  "id": "orangehrm-login-test;valide-login",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user is on the login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user varifies page title",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user enters username and password",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user clicks on login",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_is_on_the_login_page()"
});
formatter.result({
  "duration": 51785681800,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_varifies_page_title()"
});
formatter.result({
  "duration": 20607200,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_enters_username_and_password()"
});
formatter.result({
  "duration": 5267910200,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_clicks_on_login()"
});
formatter.result({
  "duration": 988240900,
  "status": "passed"
});
});