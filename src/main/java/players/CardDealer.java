package players;

import Deck.Deck;
import Deck.Card;

import java.util.ArrayList;

public class CardDealer implements Dealer{
    Deck deck;
    ArrayList<Card> playedCards;

    public CardDealer()
    {
        deck = new Deck();
        playedCards = new ArrayList<Card>();
    }
    @Override
    public void deal(){

    }

    @Override
    public String playGame() {
        return null;
    }

    public void addPoints(Player player) {

    }

    @Override
    public void showHands() {

    }

    @Override
    public void shuffle() {
        deck.shuffleDeck();
    }

    @Override
    public void addPoints(Player player, ArrayList<Card> cards) {

    }

    @Override
    public Player playRound() {
        return new Player("Bob");
    }

    public void setDeck(){
        deck = new Deck();
    }

    public void giveCard(Player player){
        player.addCard(deck.getTopCard());
    }

    public void addPlayedToHand(Player player){

    }
}
