$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src\\test\\resources\\Sample.feature");
formatter.feature({
  "name": "Checking just Sample.",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "Validating the parallel execution.",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition1.validating_the_parallel_execution()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Its done.",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition1.its_done()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("src\\test\\resources\\login.feature");
formatter.feature({
  "name": "Checking the login fuctionality in Lidaveqa application",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "Validating the login fuctionality.",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.validating_the_login_fuctionality()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Enters the valid username and valid password.",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "lenproautomation8@lenqat.com",
        "Community17"
      ]
    },
    {
      "cells": [
        "Amala",
        "Amala@123"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.user_Enters_the_valid_username_and_valid_password(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks the login button.",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_clicks_the_login_button()"
});
formatter.result({
  "status": "passed"
});
});