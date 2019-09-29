package players;

import Deck.Card;
import Deck.Hand;

import java.util.ArrayList;

public class CardPlayer extends Player{
    private String name;
    private Hand hand;
    private int score;

    public CardPlayer(String name){
        super(name);
        this.name = name;
        hand = new Hand();
        score = 0;
    }

    public void addPoints(ArrayList<Card> points){
        for(Card card: points)
            addCard(card);
    }

    public void showHand() {
        System.out.println(name + " has this hand:");
        hand.printHand();
        System.out.println();
    }

    @Override
    public int getScore(){
        return getHandSize();
    }
    @Override
    public String toString(){
        return name + " " + getHandSize();
    }
}
