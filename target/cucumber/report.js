$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/TF_Login.feature");
formatter.feature({
  "line": 2,
  "name": "validate Techfios login functionality",
  "description": "",
  "id": "validate-techfios-login-functionality",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@otherFeature"
    },
    {
      "line": 1,
      "name": "@smoke"
    }
  ]
});
formatter.scenarioOutline({
  "line": 9,
  "name": "1 User should be able to login with the valid credentials",
  "description": "",
  "id": "validate-techfios-login-functionality;1-user-should-be-able-to-login-with-the-valid-credentials",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 8,
      "name": "@other1"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "User enters \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "user click on signin button",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "user will land on the Dashboard Page",
  "keyword": "Then "
});
formatter.examples({
  "line": 13,
  "name": "",
  "description": "",
  "id": "validate-techfios-login-functionality;1-user-should-be-able-to-login-with-the-valid-credentials;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 15,
      "id": "validate-techfios-login-functionality;1-user-should-be-able-to-login-with-the-valid-credentials;;1"
    },
    {
      "cells": [
        "demo@techfios.com",
        "abc123"
      ],
      "line": 16,
      "id": "validate-techfios-login-functionality;1-user-should-be-able-to-login-with-the-valid-credentials;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 7872483800,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "comments": [
    {
      "line": 5,
      "value": "#\tGiven User is on the techfios login page"
    },
    {
      "line": 6,
      "value": "#\tGiven User is on the \"techfios\" login page"
    }
  ],
  "line": 7,
  "name": "User is on the \"techfios\" login page",
  "keyword": "Given "
});
formatter.match({
  "arguments": [
    {
      "val": "techfios",
      "offset": 16
    }
  ],
  "location": "LoginStepDef.user_is_on_the_login_page(String)"
});
formatter.result({
  "duration": 4850492700,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "1 User should be able to login with the valid credentials",
  "description": "",
  "id": "validate-techfios-login-functionality;1-user-should-be-able-to-login-with-the-valid-credentials;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@smoke"
    },
    {
      "line": 1,
      "name": "@otherFeature"
    },
    {
      "line": 8,
      "name": "@other1"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "User enters \"demo@techfios.com\" and \"abc123\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "user click on signin button",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "user will land on the Dashboard Page",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "demo@techfios.com",
      "offset": 13
    },
    {
      "val": "abc123",
      "offset": 37
    }
  ],
  "location": "LoginStepDef.user_enters_and(String,String)"
});
formatter.result({
  "duration": 2265771800,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDef.user_click_on_signin_button()"
});
formatter.result({
  "duration": 5554302000,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDef.user_will_land_on_the_Dashboard_Page()"
});
formatter.result({
  "duration": 316122900,
  "status": "passed"
});
formatter.after({
  "duration": 787768400,
  "status": "passed"
});
});