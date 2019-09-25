package players;

import Deck.Card;
import Deck.Hand;

public class Player {
    Hand hand;

    public Player(){

    }

    public Card playCard(){
        return hand.playCard();
    }

    public void addCard(Card card){
        hand.addToHand(card);
    }
}
