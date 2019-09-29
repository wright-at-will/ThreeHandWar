package players;

import Deck.Card;

import java.util.ArrayList;

public interface Dealer {
    //Dealer should be injected with the type of battle that it needs. Or the battle class should be polymorphic and just accept everything
    void deal();
    void addPoints(Player player, ArrayList<Card>cards);
    Player playRound();
    String playGame();
    void showHands();
    void shuffle();
}
