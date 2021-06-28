$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("NumberOfGuestsUpdateOnHomePage.feature");
formatter.feature({
  "line": 2,
  "name": "User can update number of guests on Landing page",
  "description": "",
  "id": "user-can-update-number-of-guests-on-landing-page",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@FirstFeature"
    }
  ]
});
formatter.scenario({
  "line": 3,
  "name": "Verify user can update number of guests on Landing page",
  "description": "",
  "id": "user-can-update-number-of-guests-on-landing-page;verify-user-can-update-number-of-guests-on-landing-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "I am on Hotels Homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I click on Guests button on Homepage",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "I add \u00272\u0027 Adults",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I add \u00272\u0027 Children",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I select age for child number \u00271\u0027 is \u00274\u0027",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I select age for child number \u00272\u0027 is \u00270\u0027",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I verify that number of adults and children same as selected",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "I click on Apply on Room options",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "I verify that total amount of guests is the same as selected in Guest rooms",
  "keyword": "Then "
});
formatter.match({
  "location": "NumberOfGuestsUpdateOnHomePageSD.launchHotels()"
});
formatter.result({
  "duration": 5373028197,
  "status": "passed"
});
formatter.match({
  "location": "NumberOfGuestsUpdateOnHomePageSD.clickOnGuestsOnHomePage()"
});
formatter.result({
  "duration": 236174809,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 7
    }
  ],
  "location": "NumberOfGuestsUpdateOnHomePageSD.selectNumberOfAdults(String)"
});
formatter.result({
  "duration": 4163248607,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 7
    }
  ],
  "location": "NumberOfGuestsUpdateOnHomePageSD.selectNumberOfChildren(String)"
});
formatter.result({
  "duration": 4129134362,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 31
    },
    {
      "val": "4",
      "offset": 38
    }
  ],
  "location": "NumberOfGuestsUpdateOnHomePageSD.selectAgeForChild(String,String)"
});
formatter.result({
  "duration": 4155316981,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 31
    },
    {
      "val": "0",
      "offset": 38
    }
  ],
  "location": "NumberOfGuestsUpdateOnHomePageSD.selectAgeForChild(String,String)"
});
formatter.result({
  "duration": 4120766506,
  "status": "passed"
});
formatter.match({
  "location": "NumberOfGuestsUpdateOnHomePageSD.verifyNumberOfAdultsAndChildren()"
});
formatter.result({
  "duration": 45613253,
  "status": "passed"
});
formatter.match({
  "location": "NumberOfGuestsUpdateOnHomePageSD.clickOnApply()"
});
formatter.result({
  "duration": 2103546731,
  "status": "passed"
});
formatter.match({
  "location": "NumberOfGuestsUpdateOnHomePageSD.verifyTotalNumberOfGuests()"
});
formatter.result({
  "duration": 48143412,
  "status": "passed"
});
});