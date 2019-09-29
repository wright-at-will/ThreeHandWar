package players;

import Battle.Battle;
import Deck.Card;
import Deck.Deck;

import java.util.ArrayList;

public class Dealer {
    Deck deck;
    //private int[] playerPoints;
    private ArrayList<Player> playerList;

    public Dealer(String[] playerNames) {
        deck = new Deck();
        playerList = new ArrayList<>();
        for(String name:playerNames){
            playerList.add(new Player(name));
        }
       // for (int i : playerPoints = new int[playerList.size()]) {
       //     playerPoints[i] = 0;
       // }
    }

    public Dealer(ArrayList<Player> playerList){
        deck = new Deck();
        this.playerList = playerList;
    }

    public void shuffle() {
        deck.shuffleDeck();
    }

    public void deal() {
        for(int i=0;i<52/playerList.size();i++){
            dealCard();
        }
    }

    protected void dealCard(){
        for(Player player: playerList)
            player.addCard(deck.getTopCard());
    }


    public String playGame() {
        doBattles();
        Player player = getWinner();
        if(player == null)
            return "TIE GAME";
        String name = player.getName();
        return name + " wins!\n";
    }

    private void doBattles() {
        System.out.println("Doing Battle");
        ArrayList<Card> playedCards = new ArrayList<>();
        while (playerList.get(0).hasHand()) {
            Player player = fight();
            for(Player allPlayers : playerList)
                playedCards.add(allPlayers.playCard());
            if (player == null) {
                System.out.println("War!");
                continue;
            }
            addPoints(player, playedCards);
            playedCards = new ArrayList<>();
        }
    }

    protected Player fight(){
        Player player = Battle.battle(playerList);
       return player;
    }

    public void addPoints(Player winner, ArrayList<Card> points) {
        System.out.println(winner.getName()+" wins the round");
        winner.addPoints(points);
        showPoints();
    }

    public void showPoints(){
        System.out.print("Score is ");
        int i;
        for(i=0;i<playerList.size()-1;i++){
            System.out.print(playerList.get(i) + ", ");
        }
        System.out.println(playerList.get(i));
    }

    private Player getWinner(){
        int max=0;
        Player winner = null;
        for(Player player:playerList){
            int score = player.getScore();
            if(max < score){
                max = score;
                winner = player;
            } else if(max == score)
                winner = null;
        }
        return winner;
    }

    public void showHands() {
        for(Player player:playerList){
            player.showHand();
        }
    }
}
