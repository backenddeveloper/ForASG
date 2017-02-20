package forASG.roulette.integration ;

import cucumber.api.java.en.Given ;
import cucumber.api.java.en.When ;
import cucumber.api.java.en.Then ;
import forASG.roulette.Customer ;
import forASG.roulette.Pocket ;
import forASG.roulette.Table ;
import forASG.roulette.RouletteGameException ;
import org.junit.Assert ;

public class Stage2
{

    private Table table ;
    private Pocket pocket ;
    private Customer customer ;
    private Exception exception ;

    @Given("^a customer has placed a bet$")
    public void customerHasPlacedABet()
    {
        table = new Table() ;
        customer = new Customer() ;
    }

    @When("^that bet is less than or equal to £(\\d+)$")
    public void betIsLessThan(int amount)
    {
        try
        {
            customer.bet((amount - 1) , table.pockets().get(8)) ;
            Assert.fail("We should have thrown a RouletteGameException") ;
        }
        catch(Exception caught)
        {
            exception = caught ;
        }
    }

    @When("^a customer has selected an invalid pocket$")
    public void selectedInvalidPocket()
    {
        try
        {
            table.record( customer.bet(1 , new Pocket("Some invalid pocket")) ) ;
            Assert.fail("We should have thrown a RouletteGameException") ;
        }
        catch(Exception caught)
        {
            exception = caught ;
        }
    }

    @Then("^the application will throw a (.*)$")
    public void willThrow(String expectedType)
    {
        Assert.assertEquals(exception.getClass().getName() , "forASG.roulette." + expectedType) ;
    }

}
