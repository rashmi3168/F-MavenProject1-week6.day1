Feature: Leaftaps functionality


Scenario Outline: Delete lead with mandatory functionality
Given Go to Lead button
And Click Find lead
And Click on Phone
And Enter Phome Number as <number>
When Click Find Lead button
Then Exit browser

Examples:
|number|
|'9007721864'|