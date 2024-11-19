import java.util.ArrayList;

public class Deck {
    private int cardsLeft;
    private ArrayList<Card> cards;

    public Deck(String[] ranks, String[] suits, int[] values) {
     cards = new ArrayList<Card>();
     for(String suit : suits)
     {
        for (int i = 0; i < ranks.length; i++)
        {
            cards.add(new Card(ranks[i], suit, values[i]));
        }
     }
     cardsLeft = cards.size();
    }

public void shuffle(ArrayList<Card> cards)
{
 for (int i = cards.size() - 1; i >= 0; i--)
 {

 }
}

public void main() {
}
}