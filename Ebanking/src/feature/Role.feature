Feature: Role Creation

Scenario Outline: Role Creation with Multiple Data

Given Tester Should on Home Page

When Tester enters Username and Password

When Tester click on Role Button

Then Tester Click on New Role button and Enters "<RoleName>" and "<RoleType>"

When Tetser Close Application

Examples:

  | RoleName | RoleType |
  | Cashiergh | E |
  | Amanagergh | E |
  | Managergh | E |