public class Card {
    private String rank;
    private String suit;
    private int value;


    public Card( String rank, String suit, int value) {
        this.value = value;
        this.suit = suit;
        this.rank = rank;
    }

    public String getRank() {
        return rank;
    }

    public String getSuit() {
        return suit;
    }

    public int getValue() {
        return value;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String toString(String rank, String suit) {
        return rank + " of " + suit;
    }
}
