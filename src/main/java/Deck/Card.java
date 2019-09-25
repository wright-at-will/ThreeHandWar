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
                this.value = Values.TWO;
                break;
            case 3:
                this.value = Values.THREE;
                break;
            case 4:
                this.value = Values.FOUR;
                break;
            case 5:
                this.value = Values.FIVE;
                break;
            case 6:
                this.value = Values.SIX;
                break;
            case 7:
                this.value = Values.SEVEN;
                break;
            case 8:
                this.value = Values.EIGHT;
                break;
            case 9:
                this.value = Values.NINE;
                break;
            case 10:
                this.value = Values.JACK;
                break;
            case 11:
                this.value = Values.QUEEN;
                break;
            case 12:
                this.value = Values.KING;
                break;
            case 13:
                this.value = Values.ACE;
                break;
        }

    }





}
