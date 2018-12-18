# Hello, this is a comment from author.
  @smoke @chrome @author_di
Feature: Search on homepage
  Verify search button is workable on homepage

  Scenario: Search 'car' on homepage
    Given homepage open
    When I enter car on search bar
    When I click search button