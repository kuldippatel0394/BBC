$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Homepage.feature");
formatter.feature({
  "line": 1,
  "name": "Testing few functionality of Homepage of BBC",
  "description": "\r\nAs a user I would like to test few functionality of navigating different pages",
  "id": "testing-few-functionality-of-homepage-of-bbc",
  "keyword": "Feature"
});
formatter.before({
  "duration": 7852017600,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "As a user I would like to navigate to different pages",
  "description": "",
  "id": "testing-few-functionality-of-homepage-of-bbc;as-a-user-i-would-like-to-navigate-to-different-pages",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "User is on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "User to accept cookie",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user to click on sign in",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user to enter email address on email address field \"kuldip.patel0394@gmail.com\"",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "user to enter password on password field \"Skyline-89\"",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "user to click on sign in button",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepdefs.userIsOnHomepage()"
});
formatter.result({
  "duration": 264077700,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.userToAcceptCookie()"
});
formatter.result({
  "duration": 2360664100,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.userToClickOnSignIn()"
});
formatter.result({
  "duration": 1565917100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "kuldip.patel0394@gmail.com",
      "offset": 52
    }
  ],
  "location": "MyStepdefs.userToEnterEmailAddressOnEmailAddressField(String)"
});
formatter.result({
  "duration": 205090600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Skyline-89",
      "offset": 42
    }
  ],
  "location": "MyStepdefs.userToEnterPasswordOnPasswordField(String)"
});
formatter.result({
  "duration": 136355000,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.userToClickOnSignInButton()"
});
formatter.result({
  "duration": 2315266400,
  "status": "passed"
});
formatter.after({
  "duration": 741996400,
  "status": "passed"
});
formatter.before({
  "duration": 4275007400,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "As a user I would navigate  to sport page",
  "description": "",
  "id": "testing-few-functionality-of-homepage-of-bbc;as-a-user-i-would-navigate--to-sport-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 14,
  "name": "User is on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "user to navigate to any of the categories from main menu",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "User to navigate to different page from selected page",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "User to click on article with comment function",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "User to verify comment is enabled or not",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepdefs.userIsOnHomepage()"
});
formatter.result({
  "duration": 52900,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.userToNavigateToAnyOfTheCategoriesFromMainMenu()"
});
formatter.result({
  "duration": 1943206200,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.userToNavigateToDifferentPageFromSelectedPage()"
});
formatter.result({
  "duration": 1711955600,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.userToClickOnArticleWithCommentFunction()"
});
formatter.result({
  "duration": 179017200,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.userToVerifyCommentIsEnabledOrNot()"
});
formatter.result({
  "duration": 1440437300,
  "status": "passed"
});
formatter.after({
  "duration": 739734300,
  "status": "passed"
});
});