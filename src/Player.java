import java.util.ArrayList;

public class Player {
    private String name;
    private int points;
    ArrayList<Card> hand;


    public Player(String name) {
        this.name = name;
        points = 0;
        this.hand = new ArrayList<>();
    }

    public Player(String name, ArrayList<Card> hand) {
        this.name = name;
        this.hand = hand;
        points = 0;
    }

    public String getName() {
        return name;
    }

    public int getPoints() {
        return points;
    }

    public ArrayList<Card> getHand() {
        return hand;
    }

    public void addPoints(int add)
    {
        points += add;
    }

    public void addCard (Card newCard)
    {
        hand.add(newCard);
        points += newCard.getValue();
    }
    
    public String toString(String name, ArrayList<Card> hand, int points){
        return name + " has " + points + " points" + "/n" + name + "'s cards: " + hand;
    }
}
