$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/com/virgingames/resources/featurefile/home.feature");
formatter.feature({
  "line": 1,
  "name": "Login page  functionality",
  "description": "\r\nAs a user\r\nI want to visit virgin Games website",
  "id": "login-page--functionality",
  "keyword": "Feature"
});
formatter.before({
  "duration": 18092375500,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "User should verify login button is displayed",
  "description": "",
  "id": "login-page--functionality;user-should-verify-login-button-is-displayed",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "I am on home page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I should see \"Login\" displayed in one of the button",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPageSteps.iAmOnHomePage()"
});
formatter.result({
  "duration": 124465600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Login",
      "offset": 14
    }
  ],
  "location": "LoginPageSteps.iShouldSeeDisplayedInOneOfTheButton(String)"
});
formatter.result({
  "duration": 236239600,
  "status": "passed"
});
formatter.after({
  "duration": 889251300,
  "status": "passed"
});
});