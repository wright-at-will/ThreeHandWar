package Deck;

public class Card {
    private Values value;
    private Suits suit;




    public Card(int value, Suits suit){
        setValue(value);
        this.suit = suit;
    }
    @Override
    public String toString(){
        return value + " of " + suit;
    }

    public int compareTo(Card card){
        return value.compareTo(card.value);
    }

    public Values getValue(){
        return value;
    }

    public Suits getSuit(){
        return suit;
    }

    private void setValue(int value){
        switch (value){
            case 2:
                this.value = Values.Two;
                break;
            case 3:
                this.value = Values.Three;
                break;
            case 4:
                this.value = Values.Four;
                break;
            case 5:
                this.value = Values.Five;
                break;
            case 6:
                this.value = Values.Six;
                break;
            case 7:
                this.value = Values.Seven;
                break;
            case 8:
                this.value = Values.Eight;
                break;
            case 9:
                this.value = Values.Nine;
                break;
            case 10:
                this.value = Values.Jack;
                break;
            case 11:
                this.value = Values.Queen;
                break;
            case 12:
                this.value = Values.King;
                break;
            case 13:
                this.value = Values.Ace;
                break;
        }

    }





}
