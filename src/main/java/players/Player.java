package players;

import Deck.Card;
import Deck.Hand;

public class Player {
    private String name;
    private Hand hand;

    public Player(String name){
        this.name = name;
        this.hand = new Hand();
    }

    public Card playCard(){
        return hand.playCard();
    }

    public void addCard(Card card){
        hand.addToHand(card);
    }

    public String getName() { return this.name; }

    public Hand getHand() {  return this.hand; }

    public void setHand(Hand hand) { this.hand = hand;}
}
