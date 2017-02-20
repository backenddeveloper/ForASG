package forASG.roulette ;

import java.util.Set ;
import java.util.HashSet ;
import java.util.List ;
import java.util.ArrayList ;
import java.util.Random ;

public class Table
{

    private int winner ;

    private Set<Bet> bets = new HashSet<Bet>() ;

    private List<Pocket> pockets = new ArrayList<Pocket>() ;

    public Table()
    {
        /*
         * When the table is created then pockets 0-36 are added to it.
         */
        for(int index = 0 ; index < 37 ; index++)
        {
            pockets.add(new Pocket(Integer.toString(index))) ;
        }
    }

    public void spinWheel()
    {
        winner = (new Random()).nextInt(37) ;
    }

    public void stopWheel()
    {
        stopWheel(pockets.get(winner)) ;
    }

    public void stopWheel(Pocket injectAWinner)
    {
        for(Bet bet : bets)
        {
            bet.callWinner(injectAWinner) ;
        }
    }

    public void record(Bet bet)
    {
        bets.add(bet) ;
    }

    public List<Pocket> pockets()
    {
        return pockets ;
    }

}
