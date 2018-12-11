$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("GetAlbumByCode.feature");
formatter.feature({
  "line": 1,
  "name": "Get Album by code",
  "description": "",
  "id": "get-album-by-code",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "A user calls an api to get an album",
  "description": "",
  "id": "get-album-by-code;a-user-calls-an-api-to-get-an-album",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "an album exists",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "a user retrieves the album by code 1",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "the status code is 200",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "the response includes the following",
  "rows": [
    {
      "cells": [
        "title",
        "quidem molestiae enim"
      ],
      "line": 7
    },
    {
      "cells": [
        "id",
        "1"
      ],
      "line": 8
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "AlbumStepDefinitions.an_album_exists()"
});
formatter.result({
  "duration": 691771234,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 35
    }
  ],
  "location": "AlbumStepDefinitions.user_retrieve_album_by_code(String)"
});
formatter.result({
  "duration": 1421713009,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "200",
      "offset": 19
    }
  ],
  "location": "AlbumStepDefinitions.the_status_code_is(int)"
});
formatter.result({
  "duration": 49612176,
  "status": "passed"
});
formatter.match({
  "location": "AlbumStepDefinitions.response_equals(String,String\u003e)"
});
formatter.result({
  "duration": 425543097,
  "status": "passed"
});
formatter.uri("GetAllPosts.feature");
formatter.feature({
  "line": 1,
  "name": "GetAllPosts",
  "description": "",
  "id": "getallposts",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "A user calls an api to get all the posts",
  "description": "",
  "id": "getallposts;a-user-calls-an-api-to-get-all-the-posts",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "almost a post exists",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "a user retrieves all the list of posts",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "the status code of the posts is 200",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "response includes 100 items",
  "keyword": "And "
});
formatter.match({
  "location": "PostStepDefinitions.almost_a_post_exists()"
});
formatter.result({
  "duration": 870406,
  "status": "passed"
});
formatter.match({
  "location": "PostStepDefinitions.user_retrieves_all_posts()"
});
formatter.result({
  "duration": 226442807,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "200",
      "offset": 32
    }
  ],
  "location": "PostStepDefinitions.status_code_post_is(int)"
});
formatter.result({
  "duration": 600534,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "100",
      "offset": 18
    }
  ],
  "location": "PostStepDefinitions.response_length(int)"
});
formatter.result({
  "duration": 55903926,
  "status": "passed"
});
});