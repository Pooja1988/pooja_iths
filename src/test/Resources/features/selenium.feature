Feature: Navigating seleniumhq.org

  Background:
    Given I am at Selenium HQ start page

  Scenario: Web driver project
    When I go project tab
    Then WebDriver is the top first project

