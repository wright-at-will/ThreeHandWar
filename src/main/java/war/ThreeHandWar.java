package war;

import Deck.Hand;
//This is the 3 player war, where all won cards are placed in a pile to the side
public class ThreeHandWar implements War{
    private Hand player1,player2,player3;

    public void setHands(){

    }

    public boolean playGame(){
        return true;
    }
}
