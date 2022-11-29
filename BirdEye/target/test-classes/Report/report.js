$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Features/Test.feature");
formatter.feature({
  "name": "Validation of Birdeye Homepage website",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Verifying the birdeye footer part learn more links",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@BirdEyeLinks"
    }
  ]
});
formatter.step({
  "name": "user is on the birdeye home page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefination.user_is_on_the_birdeye_home_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Verify All Headers Navigations are working fine",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefination.verifyAllHeaderNavigationisWorkingFine()"
});
formatter.result({
  "status": "skipped"
});
});