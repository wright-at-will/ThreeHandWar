package Deck;

import java.util.ArrayList;
import java.util.LinkedList;

public class Hand {
    private LinkedList<Card> hand = new LinkedList<Card>();

    public Hand(){

    }

    public void fillHand(ArrayList<Card> newHand){
        for (Card card: newHand) {
            hand.addLast(card);
        }
    }

    public void addToHand(Card card){
        hand.addLast(card);
    }

    public Card playCard(){
        return hand.pop();
    }

    public String toString(){
        return hand.toString();
    }

    public int getSize() { return hand.size(); }
}
