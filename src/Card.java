public class Card {
    //instance variables
    private String rank;
    private String suit;
    private int value;

//constructor: initializes the value, rank & suit
    public Card( String rank, String suit, int value) {
        this.value = value;
        this.suit = suit;
        this.rank = rank;
    }

    //returns the rank of a specific card
    public String getRank() {
        return rank;
    }

    //returns the suit of a specific card
    public String getSuit() {
        return suit;
    }

    //returns the numerical value of a specific card
    public int getValue() {
        return value;
    }

    //sets a card's rank as the inputted String
    public void setRank(String rank) {
        this.rank = rank;
    }

    //sets a card's suit as the inputted String
    public void setSuit(String suit) {
        this.suit = suit;
    }

    //sets a card's value as the inputted number
    public void setValue(int value) {
        this.value = value;
    }

    //returns a String statement including the rank and suit of the card
    public String toString()
    {
        return rank + " of " + suit;
    }
}
