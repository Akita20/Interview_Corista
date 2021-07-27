Feature:  As a user, I should be able to see and click following tabs.

  Scenario: Qualities menu page links verification
    Given user is on the home page
    When user click the menuButton;
    And user should see the page title is Qualities
    Then user should see following links
      | Solutions     |
      | Industries    |
      | How We Engage |
      | Products      |
      | Partners      |
      | About         |
      | Insights      |
      | Contact Us    |




