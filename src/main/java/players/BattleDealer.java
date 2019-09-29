package players;

import Battle.Battle;
import Deck.Deck;
import Deck.Card;
import Deck.Suits;

import java.util.ArrayList;
import java.util.Random;


//Implements creating a game with only enough cards for one battle
public class BattleDealer extends Dealer{

    //Deck deck;

    //public Player player1, player2;

    public BattleDealer(String name1, String name2){
        super(new String[]{name1,name2});
    }

    @Override
    public String playGame(){
        Player player = fight();
        if(player == null)
            return "TIE GAME";
        String name = player.getName();
        return name + " wins!";
    }

    @Override
    public void deal() {
      dealCard();
    }


}
