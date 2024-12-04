import java.util.ArrayList;

public class Deck {
    //instance variables
    private int cardsLeft;
    private final ArrayList<Card> cards;

    //constructor
    public Deck(String[] ranks, String[] suits, int[] values) {
        this.cards = new ArrayList<>();
        // For each loop that assigns each card a rank, suit, and value
        for (String suit : suits)
            for (int i = 0; i < ranks.length; i++) {
                cards.add(new Card(ranks[i], suit, values[i]));
            }
        cardsLeft = cards.size();
    }
    // method returns true if cardsLeft is 0, false otherwise
    public boolean isEmpty() {
        return cardsLeft == 0;
    }

    // Method returns number of cards left in the deck
    public int getCardsLeft() {
        return cardsLeft;
    }

    // Method deals a card by returning the last card in a deck
    public Card deal() {
       // If there are no cards left, returns null
        if (cardsLeft == 0) {
            return null;
        }

        cardsLeft--;
        return cards.get(cardsLeft);
    }

    // Method shuffles a deck
    public void shuffle() {
        for (int i = cards.size() - 1; i >= 0; i--) {
            int random = (int) (Math.random() * i);
            Card temp = cards.get(i);
            cards.set(i, cards.get(random));
            cards.set(random, temp);
            i--;
        }
    }
}


