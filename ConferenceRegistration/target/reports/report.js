$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login.feature");
formatter.feature({
  "line": 2,
  "name": "Registration form",
  "description": "I want to login",
  "id": "registration-form",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@tag"
    }
  ]
});
formatter.before({
  "duration": 168829,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "login to registration form",
  "description": "",
  "id": "registration-form;login-to-registration-form",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 5,
      "name": "@execute"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "I have a registration form",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I enter valid username and valid password",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "the result should be opening of login page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepdefination.i_have_a_registration_form()"
});
formatter.result({
  "duration": 6466465680,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepdefination.i_enter_valid_username_and_valid_password()"
});
formatter.result({
  "duration": 5385644423,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepdefination.the_result_should_be_opening_of_login_page()"
});
formatter.result({
  "duration": 11903711,
  "status": "passed"
});
formatter.after({
  "duration": 2389384827,
  "status": "passed"
});
});