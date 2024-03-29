package players;

import Battle.Battle;
import Deck.Deck;
import Deck.Card;

import java.util.ArrayList;

public class CardDealer extends Dealer{

    public CardDealer(ArrayList<Player> players) {
        super(players);
    }

    @Override
    public void addPoints(Player winner, ArrayList<Card> points) {
        System.out.println(winner.getName()+" wins the round");
        winner.addPoints(points);
        showPoints();
    }
}
