package Deck;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public class Deck {
    private LinkedList<Card> deck = new LinkedList<Card>();

    public Deck(){
    //Sets the entire deck
       setDeck();
    }

    public Deck(LinkedList<Card> givenDeck){
        deck = givenDeck;
    }

    public void setDeck(){
        Random rand = new Random();
        ArrayList<Card> newDeck = new ArrayList<Card>();
        for(int i=2 ; i<14 ; i++){
            for(int j=0;j<4;j++){
                newDeck.add(new Card(i, Suits.Club));
                newDeck.add(new Card(i, Suits.Diamond));
                newDeck.add(new Card(i, Suits.Heart));
                newDeck.add(new Card(i, Suits.Spade));
            }
        }
        for(int i=51;i>-1;i--){
            deck.add(newDeck.remove(rand.nextInt(i)));
        }
    }
    public Card getTopCard(){
        return deck.pop();
    }

    public Boolean hasCards(){
        return !deck.isEmpty();
    }

    public LinkedList<Card> getDeck(){
        return deck;
    }

    public void printDeck(){
        for (Card card: deck)
            System.out.println(card);
    }


}
