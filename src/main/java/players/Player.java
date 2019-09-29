package players;

import Deck.Card;
import Deck.Hand;

import java.util.ArrayList;

public abstract class Player {
    private String name;
    private Hand hand;

    abstract int getScore();
    abstract void addPoints(ArrayList<Card> points);

    public Player(String name){
        this.name = name;
        hand = new Hand();
    }
    public void addCard(Card card){ hand.addToHand(card); }
    public String getName() { return this.name; }
    public Hand getHand() {  return this.hand; }
    public void setHand(Hand hand) { this.hand = hand;}
    public Card peek(){ return hand.peek(); }
    public boolean hasHand(){ return hand.getSize() != 0; }
    public int getHandSize(){ return hand.getSize(); }

    public Card playCard(){
        Card card = hand.playCard();
        System.out.println(name + " plays " + card + " as up card");
        return card;
    }



    public void showHand(){
        System.out.println(name+" has this hand:");
        hand.printHand();
        System.out.println();
    }



}
