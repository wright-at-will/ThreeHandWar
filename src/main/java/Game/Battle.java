package Game;

import Deck.Card;
import Deck.Hand;

public class Battle {

    public Battle(Hand player1, Hand player2){
        Card player1Card, player2Card;

        player1Card = player1.playCard();
        player2Card = player2.playCard();
        int outcome = player1Card.compareTo(player2Card);
        if(outcome>0){
            player1.addToHand(player2Card);
            player1.addToHand(player1Card);
        } else if(outcome < 0){
            player2.addToHand(player1Card);
            player2.addToHand(player2Card);
        }
    }
}
