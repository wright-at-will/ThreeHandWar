package players;

import Deck.Card;
import Deck.Hand;

public class CardPlayer {
    private String name;
    private Hand hand;
    private int score;
    public CardPlayer(String name){
        super(name);
        this.name = name;
        hand = new Hand();
        score = 0;
    }

    public Card playCard(){
        Card card = hand.playCard();
        System.out.println(name + " plays " + card + " as up card");
        return card;
    }

    public void addCard(Card card){
        hand.addToHand(card);
    }

    public void addPoints(int points){
        score += points;
    }

    public String getName() { return this.name; }

    public Hand getHand() {  return this.hand; }

    public void setHand(Hand hand) { this.hand = hand;}

    public void showHand() {
        System.out.println(name + " has this hand:");
        hand.printHand();
        System.out.println();
    }

    public boolean hasHand(){
        return hand.getSize() != 0;
    }

    public int getHandSize(){
        return hand.getSize();
    }

    public int getScore(){
        return score;
    }
    @Override
    public String toString(){
        return name + " " + score;
    }
}
