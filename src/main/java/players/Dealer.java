package players;

import Deck.Deck;

public class Dealer {
    Deck deck;

    public Dealer(){
        deck = new Deck();
    }

    public void setDeck(){
        deck = new Deck();
    }

    public void giveCard(Player player){
        player.addCard(deck.getTopCard());
    }
}
