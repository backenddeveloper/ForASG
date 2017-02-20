package forASG.roulette ;

public class Customer
{

    private int lastWin = 0 ;

    public Bet bet(int amount , Pocket pocket)
    {
        return new Bet(this , amount , pocket) ;
    }

    public void win(int amount)
    {
        lastWin = amount ;
    }

    public int lastWin()
    {
        return lastWin ;
    }

}
