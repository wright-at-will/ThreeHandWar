package Deck;


import java.util.ArrayList;
import java.util.Random;

public class Deck {
    private ArrayList<Card> deck = new ArrayList<Card>();

    public Deck(){
    //Sets an organized deck
       setDeck();
    }

    public Deck(ArrayList<Card> givenDeck){
        deck = givenDeck;
    }

    public void setDeck(){
        ArrayList<Card> newDeck = new ArrayList<Card>();
        for(int i=2 ; i<15 ; i++){
                newDeck.add(new Card(i, Suits.CLUBS));
                newDeck.add(new Card(i, Suits.DIAMONDS));
                newDeck.add(new Card(i, Suits.HEARTS));
                newDeck.add(new Card(i, Suits.SPADES));
        }
        deck = newDeck;
    }

    public void shuffleDeck(){
        Random rand = new Random();
        ArrayList<Card> oldDeck = deck;
        deck = new ArrayList<Card>();
        for(int i=52;i>0;i--){
            deck.add(oldDeck.remove(rand.nextInt(oldDeck.size())));
        }
    }

    public Card getTopCard(){
        return deck.remove(0);
    }

    public Boolean hasCards(){
        return !deck.isEmpty();
    }

    public ArrayList<Card> getDeck(){
        return deck;
    }

    public void printDeck(){
        for (Card card: deck)
            System.out.println(card);
    }


}
