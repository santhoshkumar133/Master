$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("sample.feature");
formatter.feature({
  "line": 1,
  "name": "CucumberJava",
  "description": "",
  "id": "cucumberjava",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Login functionality exists",
  "description": "",
  "id": "cucumberjava;login-functionality-exists",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "I have open the browser",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I open Facebook website",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "Login button should exits",
  "keyword": "Then "
});
formatter.match({
  "location": "Loginstepdefinition.i_have_open_the_browser()"
});
formatter.result({
  "duration": 8973690300,
  "status": "passed"
});
formatter.match({
  "location": "Loginstepdefinition.i_open_Facebook_website()"
});
formatter.result({
  "duration": 6004273600,
  "status": "passed"
});
formatter.match({
  "location": "Loginstepdefinition.login_button_should_exits()"
});
formatter.result({
  "duration": 6130302700,
  "status": "passed"
});
});