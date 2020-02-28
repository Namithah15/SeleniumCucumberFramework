@DataDrivenTesting
Feature: Amazon search validation
Scenario Outline: Amazon search product validations
	Given Open Chrome browser with URL
	When Search product "<SearchString>"
	And Click on product name
	Then Validate product name
Examples:
	| SearchString |
	| amazon fire tv stick |
	| amazon echo dot |

