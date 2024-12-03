import java.util.ArrayList;

public class Deck {
    //instance variables
    private int cardsLeft;
    private final ArrayList<Card> cards;

    //constructor
    public Deck(String[] ranks, String[] suits, int[] values) {
     this.cards = new ArrayList<>();
     for(String suit : suits)
         for (int i = 0; i < ranks.length; i++) {
             cards.add(new Card(ranks[i], suit, values[i]));
         }
     cardsLeft = cards.size();
    }

public boolean isEmpty()
{
    return cardsLeft == 0;
}

public int getCardsLeft()
{
    return cardsLeft;
}

public Card deal()
{
    if (cardsLeft == 0)
    {
        return null;
    }

    cardsLeft --;
    return cards.get(cardsLeft);
}

public void shuffle()
{
 for (int i = cards.size() - 1; i >= 0; i--)
 {
    int random = (int) (Math.random() * i);
   Card temp = cards.get(i);
    cards.set(i, cards.get(random));
    cards.set(random, temp);
    i--;
 }
}


    public static void main(String[] args) {

    }
}