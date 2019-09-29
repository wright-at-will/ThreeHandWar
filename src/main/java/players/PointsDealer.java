package players;

import Battle.Battle;
import Deck.Deck;
import Deck.Card;

import java.util.ArrayList;

public class PointsDealer implements Dealer {
    Deck deck;
    private int[] playerPoints;
    private ArrayList<Player> playerList;
    private int storedPoints = 0;


    public PointsDealer(String[] playerNames) {
        deck = new Deck();
        playerList = new ArrayList<>();
        for(String name:playerNames){
            playerList.add(new Player(name));
        }
        for (int i : playerPoints = new int[playerList.size()]) {
            playerPoints[i] = 0;
        }

        //playedCards = new ArrayList<Card>();
    }

    @Override
    public void deal() {
        for(int i=0;i<52/playerList.size();i++){
            for(Player player:playerList){
                player.addCard(deck.getTopCard());
            }
        }
    }

    @Override
    public String playGame() {
        return null;
    }

    @Override
    public void shuffle() {
        deck.shuffleDeck();
    }

    @Override
    public void addPoints(Player player, ArrayList<Card> points) {
        playerPoints[playerList.indexOf(player)] += points.size();
    }

    @Override
    public Player playRound() {
        return Battle.battle(playerList);
    }

    @Override
    public void showHands() {
        for(Player player:playerList){
            player.showHand();
        }
    }
}


