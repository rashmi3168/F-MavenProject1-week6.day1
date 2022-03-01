Feature: Leaftaps functionality


Scenario Outline: Edit lead with mandatory functionality
Given Go to Lead button
And Click Find lead
And First Name is <fname>
When Click Find Lead button
Then Exit browser

Examples:
|fname|
|'Rashmi'|