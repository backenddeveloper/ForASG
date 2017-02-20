Feature: The bet
    The objects that ties a customer, amount and pocket together

Scenario: The customer can place a bet
    Given a customer
    When a bet of £1337 is placed on a mock pocket
    Then a bet object of amount £1337 is returned


