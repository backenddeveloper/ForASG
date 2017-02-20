Ability: To validate a bet

Background:
    Given a customer has placed a bet

Scenario: A negative bet
    When that bet is less than or equal to £0
    Then the application will throw a RouletteGameException

Scenario: An invalid pocket
    When a customer has selected an invalid pocket
    Then the application will throw a RouletteGameException
