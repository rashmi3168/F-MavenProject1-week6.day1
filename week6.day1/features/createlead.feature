Feature: Leaftaps functionality


Scenario Outline: Create lead with mandatory functionality
Given Go to Lead button
And Click create lead
And Enter Company Name as <cname>
And Enter First Name as <fname>
And Enter Last Name as <lname>
When Click Create Lead button
Then Exit browser

Examples:
|cname|fname|lname|
|'Testleaf'|'Rashmi'|'Bhatt'|