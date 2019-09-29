package players;

import Battle.Battle;
import Deck.Deck;
import Deck.Card;
import Deck.Suits;

import java.util.ArrayList;
import java.util.Random;


//Implements creating a game with only enough cards for one battle
public class BattleDealer implements Dealer{

    Deck deck;

    public Player player1, player2;

    public BattleDealer(Player player1, Player player2){
        this.player1 = player1;
        this.player2 = player2;
        deck = new Deck();
    }

    @Override
    public String playGame(){
        return playRound().getName();
    }

    @Override
    public void deal() {
        player1.addCard(deck.getTopCard());
        player2.addCard(deck.getTopCard());
    }

    @Override
    public void shuffle() {
        deck.shuffleDeck();
    }

    @Override
    public void addPoints(Player player, ArrayList<Card> points) {
        //playerPoints[playerList.indexOf(player)] += points.size();
    }

    @Override
    public Player playRound() {
        return Battle.battle(player1,player2);
    }

    @Override
    public void showHands() {
        player1.showHand();
        player2.showHand();

    }

}
