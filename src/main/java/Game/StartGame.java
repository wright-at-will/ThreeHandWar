package Game;

import players.*;

import java.util.ArrayList;

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

        Player player1 = new PointPlayer("Bob");
        Player player2 = new PointPlayer("Mary");
        Player player3 = new PointPlayer("Sue");
        ArrayList<Player> players = new ArrayList<>();
        players.add(player1);
        players.add(player2);
        Dealer dealer1 = new CardDealer(players);
        dealer1.shuffle();
        dealer1.deal();
        System.out.println(dealer1.playGame());


        player1 = new PointPlayer("Bob");
        player2 = new PointPlayer("Mary");
        player3 = new PointPlayer("Sue");
        players = new ArrayList<>();
        players.add(player1);
        players.add(player2);
        players.add(player3);

        Dealer dealer2 = new Dealer(players);
        dealer2.shuffle();
        dealer2.deal();
        System.out.println(dealer2.playGame());

        System.out.println();

        player1 = new CardPlayer("Bob");
        player2 = new CardPlayer("Mary");
        players = new ArrayList<>();
        players.add(player1);
        players.add(player2);

        Dealer dealer3 = new BattleDealer(players);
        dealer3.shuffle();
        dealer3.deal();
        System.out.println(dealer3.playGame());

    }
}
