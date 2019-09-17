package Deck;

public class Card {
    private values value;
    private suits suit;

    public enum values{
        One, Two, Three, Four, Five, Six, Seven, Eight, Nine, Ten, Jack, Queen, King, Ace;
    }

    public enum suits {
        Diamond, Heart, Spade, Club;
    }
    public Card(values value, suits suit){
        this.value = value;
        this.suit = suit;
    }
    @Override
    public String toString(){
        return value.toString() + " of " + suit.toString();
    }

    public int compareTo(Card card){
        return value.compareTo(card.value);
    }

    public values getValue(){
        return value;
    }

    public suits getSuit(){
        return suit;
    }





}
