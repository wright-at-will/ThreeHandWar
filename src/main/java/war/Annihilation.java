package war;

import Deck.*;
import players.Dealer;
import players.Player;
//This is the war that doesn't end until someone loses all cards
public class Annihilation implements War{
    private Player player1,player2;
    private Dealer dealer;
    private Deck deck;
    public boolean play(){
        dealer = new Dealer();
        return true;
    }

    public void setHands(){

        for(int i = 0; i < 26; i++){
            dealer.giveCard(player1);
            dealer.giveCard(player2);
        }
    }
    public void set(){

    }
}
