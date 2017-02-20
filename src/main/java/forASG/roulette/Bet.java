package forASG.roulette ;

public class Bet
{

    private int amount ;

    private Pocket pocket ;

    private Customer customer ;

    public Bet(Customer customer , int amount , Pocket pocket)
    {
        this.customer = customer ;
        this.amount   = amount ;
        this.pocket   = pocket ;
    }

    public int amount()
    {
        return amount ;
    }

    public void callWinner(Pocket winningPocket)
    {
        if(winningPocket == pocket)
        {
            customer.win( 36 * amount ) ;
        }
    }

}
