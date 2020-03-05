@DataDrivenTesting
Feature: Amazon search validation
Scenario Outline: Amazon search product validations
	Given Open the URL
	When Search product "<SearchString>"
	And Click on product name
	Then Validate product name
Examples:
	| SearchString |
	| amazon fire tv stick |
	| amazon echo dot |

