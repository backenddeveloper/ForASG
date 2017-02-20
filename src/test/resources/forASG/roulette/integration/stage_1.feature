Ability: To win and loose

Background:
    Given a customer places a bet of £10 on a pocket
    When I spin the roulette wheel

Scenario: A customer can loose
    And the ball lands in a losing pocket
    Then the customer will receive £0 winnings

Scenario: A customer recieves winnings
    And the ball lands in a winning pocket
    Then the customer will receive £360 winnings
