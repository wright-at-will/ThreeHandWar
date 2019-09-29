package Game;

import Battle.Battle;
import Deck.Deck;
import players.Dealer;
import players.Player;
import players.PointsDealer;
import war.Annihilation;
import war.War;

public class StartGame {

    public static void main(String[] args) {
        //War war = new Annihilation();
        //war.playGame();
        //Deck deck = new Deck();
        //deck.printDeck();
        //deck.shuffleDeck();
        //deck.printDeck();
        String[] names1 = {"Bob", "Sue"};
        String[] names2 = {"Bob","Mary","Sue"};

        Dealer dealer1 = new PointsDealer(names1);
        dealer1.shuffle();
        dealer1.deal();
        dealer1.showHands();
        dealer1.playRound();
        //Dealer dealer2 = new PointsDealer(names2);
        //dealer2.shuffle();
        //dealer2.deal();
        //dealer2.showHands();

    }
}
