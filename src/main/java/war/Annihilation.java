package war;

import Deck.*;
import players.CardDealer;
import players.Player;
//This is the war that ends after a set amount of rounds played. Whoever has the most cards at the end wins.
public class Annihilation implements War {
    @Override
    public void playGame(String[] playerNames) {
    }




    /*    private Player player1,player2;
    private CardDealer dealer;
    private Deck deck;
    private int iterationLimit;
    private boolean playing;

    public boolean playGame(){
        this.playing = true;
        player1 = new Player("Bob");
        player2 = new Player("Sue");
        dealer = new CardDealer();
        setHands();
        iterationLimit = 100;

        for (int i = 0; i <= iterationLimit; i++) {
            //Battle here
            if(playing)
                playRound();
            else
                break;
        }

        endGame();
        return true;
    }

    public void setHands(){

        for(int i = 0; i < 26; i++){
            dealer.giveCard(player1);
            dealer.giveCard(player2);
        }
    }

    private void playRound() {
        if (player1.getHand().getSize() == 0 || player2.getHand().getSize() == 0) {
            this.playing = false;
            return;
        }
        Card player1Card = playCard(player1);
        Card player2Card = playCard(player2);
        if (player1Card.compareTo(player2Card) > 0)
            player1 = winRound(player1, player2Card, player1Card);
        if (player1Card.compareTo(player2Card) < 0)
            player2 = winRound(player2,player1Card,player2Card);
        if (player1Card.compareTo(player2Card) == 0) {
            tieRound();
            return;
        }
        printScore();
    }

    private void endGame() {
        System.out.println("Game Over");

        if (player1.getHand().getSize() > player2.getHand().getSize())
            System.out.println(player1.getName() + " Wins!");
        else if (player1.getHand().getSize() < player2.getHand().getSize())
            System.out.println(player2.getName() + " Wins!");
        else
            System.out.println("Tie Game!");
    }

    private Card playCard(Player player){
        Card card = player.playCard();
        System.out.println(player.getName() + " plays " + card.getValue() + " of " + card.getSuit() + " as up card");
        return card;
    }

    private Player winRound(Player winner, Card newCard, Card originalCard) {
        winner.addCard(originalCard);
        winner.addCard(newCard);
        System.out.println(winner.getName() + " wins the round");
        return winner;
    }

    private void tieRound() {
        System.out.println("War!");
        playRound();
    }

    private void printScore() {
        System.out.println("Score is " + player1.getName() + " " + player1.getHand().getSize()
                + ", " + player2.getName() + " " + player2.getHand().getSize() + "\n");
    }

    */
}
