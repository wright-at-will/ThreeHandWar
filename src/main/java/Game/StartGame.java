package Game;

import players.BattleDealer;
import players.CardDealer;
import players.Dealer;

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

        Dealer dealer1 = new CardDealer(names1);
        dealer1.shuffle();
        dealer1.deal();
        System.out.println(dealer1.playGame());


        Dealer dealer2 = new Dealer(names2);
        dealer2.shuffle();
        dealer2.deal();
        System.out.println(dealer2.playGame());

        System.out.println();
        Dealer dealer3 = new BattleDealer(names1[0],names1[1]);
        dealer3.shuffle();
        dealer3.deal();
        System.out.println(dealer3.playGame());

    }
}
