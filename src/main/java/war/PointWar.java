package war;

import Deck.Hand;
import players.Dealer;
import players.PointsDealer;

//This is the war where all won cards are placed in a pile to the side
public class PointWar implements War {
    private Hand player1, player2;

    public void playGame(String[] playerNames){
        //Create a dealer with  the playerNames. Dealer will handle creating players, randomized deck, and giving out hands.
        //Dealer dealer = new PointsDealer(playerNames);
    }

    public void setHands() {

    }
}
