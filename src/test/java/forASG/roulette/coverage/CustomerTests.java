package forASG.roulette.coverage ;

import cucumber.api.java.en.Given ;
import cucumber.api.java.en.When ;
import cucumber.api.java.en.Then ;
import forASG.roulette.Bet ;
import forASG.roulette.Pocket ;
import forASG.roulette.Customer ;
import static org.junit.Assert.assertEquals ;

public class CustomerTests
{

    private Customer customer ;
    private Bet bet ;

    @Given("^a customer$")
    public void aCustomer()
    {
        customer = new Customer() ;
    }

    @When("^a bet of £(\\d+) is placed on a (.*) pocket$")
    public void aBetIsPlaced(int amount , String name) throws Throwable
    {
        bet = customer.bet(amount , new Pocket(name)) ;
    }

    @Then("^a bet object of amount £(\\d+) relating to (.*) pocket is returned$")
    public void aBetIsReturned(int amount , String name)
    {
        assertEquals(amount , bet.amount()) ;
        assertEquals(name , bet.pocket().name()) ;
    }
}
