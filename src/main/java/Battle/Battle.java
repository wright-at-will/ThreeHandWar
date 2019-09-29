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
        return pairWinner(player1,player2);
    }

    public static Player battle(Player player1, Player player2, Player player3){
        Player winner = battle(player1,player2);
        if(winner != null){
            winner = battle(winner, player3);
        } else if(battle(player2,player3) == player3)
            winner = player3;
        return winner;
    }

    public static Player battle(ArrayList<Player> players){



        Player winner = players.get(0);
        int i=1;
        Boolean tie = false;
        while(i<players.size()){
            Player player = pairWinner(winner, players.get(i));
            if(player == null){
                tie = true;
            }else if(player != winner) {
                winner = player;
                tie = false;
            }
            i++;
        }
        if(tie)
            return null;
        return winner;
    }

    private static Player pairWinner(Player player1, Player player2){
        int comparison = player1.peek().compareTo(player2.peek());
        if(comparison > 0){
            return player1;
        } else if(comparison < 0){
            return player2;
        } else
            return null;

    }

}
