package forASG.roulette ;

public class Bet
{

    private int amount ;

    private Pocket pocket ;

    private Customer customer ;

    public Bet(Customer customer , int amount , Pocket pocket) throws RouletteGameException
    {
        if(amount > 0)
        {
            this.customer = customer ;
            this.amount   = amount ;
            this.pocket   = pocket ;
        }
        else
        {
            throw new RouletteGameException() ;
        }
    }

    public int amount()
    {
        return amount ;
    }

    public Pocket pocket()
    {
        return pocket ;
    }

    public void callWinner(Pocket winningPocket)
    {
        if(winningPocket == pocket)
        {
            /*
             * This is planned ot change in the future.
             */
            customer.win( 36 * amount ) ;
        }
    }

}
