@tag
Feature: Home Page Verification

  Background: Admin launch browser
    Given Admin able to launch browser

  @tag1
  Scenario: Verify admin is able to land on home page
    When Admin gives the correct LMS portal URL
    Then Admin should land on the home page
