package Battle;

import Deck.Card;
import players.Dealer;
import players.Player;

import java.util.ArrayList;

public class Battle {
    //Battle gets injected with the dealer
    Dealer dealer;

    public Battle(Dealer dealer){
        this.dealer = dealer;
    }

    public Battle(){}

    public static Player battle(Player player1, Player player2){
        System.out.println("Inside battle");
        int compare = player1.peek().compareTo(player2.peek());
        if(compare > 0){
            return player1;
        } else if(compare < 0){
            return player2;
        }
        return null;
    }

    public static Player battle(Player player1, Player player2, Player player3){
        if(player2.peek().compareTo(player1.peek()) > 0 && player2.peek().compareTo(player3.peek()) > 0)
            return player2;
        if(player1.peek().compareTo(player2.peek()) > 0 && player1.peek().compareTo(player3.peek()) > 0)
            return player1;
        if(player3.peek().compareTo(player1.peek()) > 0 && player3.peek().compareTo(player2.peek()) > 0)
            return player3;
        return null;
    }

    public static Player battle(ArrayList<Player> players){
        Player winner = null;
        for (int i = 0;i<players.size()-1;i++){
            Player player = players.get(i);
            for(int j = players.indexOf(player)+1; j<players.size()+1;j++){
                try {
                    int compare;
                    compare = player.peek().compareTo(players.get(j).peek());
                    if (compare == 0) {
                        //if there is a tie, treat it as a loss so they don't set winner
                        i = j;
                        break;
                    } else if(compare < 0){
                        winner = players.get(j);
                        i=j;
                        break;
                    }
                } catch (Exception e){
                    winner = player;
                }

            }
        }
        return winner;
    }

}
