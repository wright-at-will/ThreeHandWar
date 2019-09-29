package players;

import Battle.Battle;
import Deck.Deck;
import Deck.Card;
import Deck.Suits;

import java.util.ArrayList;


//Implements creating a game with only enough cards for one battle
public class BattleDealer extends Dealer{


    public BattleDealer(String name1, String name2){
        super(new String[]{name1,name2});
    }

    public BattleDealer(ArrayList<Player> players){
        super(players);
    }

    @Override
    public String playGame(){
        ArrayList<Card> cards = new ArrayList<>();

        System.out.println("Doing Battle");
        Player player = fight();
        for(Player players: playerList)
            cards.add(players.playCard());
        if(player == null)
            return "TIE GAME";
        addPoints(player, cards);
        String name = player.getName();
        return name + " wins!";
    }

    @Override
    public void deal() {
      dealCard();
    }


}
