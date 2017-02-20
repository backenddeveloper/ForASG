package forASG.roulette ;

public class Customer
{

    private int lastWin = 0 ;

    public void win(int amount)
    {
        lastWin = amount ;
    }

    public int lastWin()
    {
        return lastWin ;
    }

    public Bet bet(int amount , Pocket pocket) throws RouletteGameException
    {
        return new Bet(this , amount , pocket) ;
    }

}
