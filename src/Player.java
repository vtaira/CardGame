import java.util.ArrayList;

public class Player {
    private String name;
    private int points;
    private ArrayList<Card> hand;


    public Player(String name) {
        this.name = name;
        points = 0;
        this.hand = hand;


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
    }
    
    public String toString(String name, ArrayList<Card> hand, int points){
        return name + " has " + points + " points" + "/n" + name + "'s cards: " + hand;
    }
}
