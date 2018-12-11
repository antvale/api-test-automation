Feature: GetAllPosts
Scenario: A user calls an api to get all the posts
Given almost a post exists
When a user retrieves all the list of posts
Then the status code of the posts is 200
And response includes 100 items