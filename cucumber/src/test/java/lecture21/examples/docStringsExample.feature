Feature: Articles - adding

  Scenario: Add a new article with content
    Given a user is logged in as an editor
    When the user creates a new article
    And adds the following content:
    """
    Lorem ipsum dolor sit amet, consectetur adipiscing elit.
    Duis mollis, risus quis convallis efficitur, libero ligula consequat enim,
    sit amet molestie quam elit sed nulla.
    """
    Then the article should be saved successfully


