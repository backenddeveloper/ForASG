package forASG.roulette.integration ;

import cucumber.api.java.en.Given ;
import cucumber.api.java.en.When ;
import cucumber.api.java.en.Then ;
import forASG.roulette.Customer ;
import forASG.roulette.Pocket ;
import forASG.roulette.Table ;
import org.junit.Assert ;

public class Stage1
{

    private Table table ;
    private Pocket pocket ;
    private Customer customer ;

    @Given("^a customer places a bet of £(\\d+) on a pocket$")
    public void customerPlacesABet(int amount) throws Throwable
    {
        table = new Table() ;
        customer = new Customer() ;
        pocket = table.pockets().get(8) ;

        table.record( customer.bet(amount , pocket) ) ;
    }

    @When("^I spin the roulette wheel$")
    public void spinTheWheel()
    {
        table.spinWheel() ;
    }

    @When("^the ball lands in a losing pocket$")
    public void loosingPocket()
    {
        table.stopWheel(new Pocket("loosing")) ;
    }

    @When("^the ball lands in a winning pocket$")
    public void winningPocket()
    {
        table.stopWheel(pocket) ;
    }

    @Then("^the customer will receive £(\\d+) winnings$")
    public void customerRecievesWinnings(int expectedWinnings)
    {
        Assert.assertEquals(expectedWinnings , customer.lastWin()) ;
    }

}
