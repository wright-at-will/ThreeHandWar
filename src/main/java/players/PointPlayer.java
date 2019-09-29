package players;

import Deck.Card;
import Deck.Hand;

import java.util.ArrayList;

public class PointPlayer extends Player{
    private String name;
    private Hand hand;
    private int score;

    public PointPlayer(String name){
        super(name);
        this.name = name;
        hand = new Hand();
        score = 0;
    }


    public void addPoints(ArrayList<Card> points){
        score += points.size();
    }

    public int getScore(){
        return score;
    }
    @Override
    public String toString(){
        return name + " " + score;
    }
}
