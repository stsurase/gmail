Feature: Write the test cases in Gmail


Scenario: write test Step on Compose Gmail

Given Open  Gmail url
Given Enter User Email ID
Given click on Next Button



Scenario: Enter details in mail

Given Click on Compose
Given Enter recipients mail id
When gmail subject
Then write gmailbody
Then Click on Send