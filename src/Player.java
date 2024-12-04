import java.util.ArrayList;

public class Player {
    // Instance variables
    private String name;
    private int points;
    ArrayList<Card> hand;

    // Constructor that takes in a player name
    public Player(String name) {
        this.name = name;
        points = 0;
        this.hand = new ArrayList<>();
    }

    // Constructor that takes in a name, and an ArrayList for the player's hand
    public Player(String name, ArrayList<Card> hand) {
        this.name = name;
        this.hand = hand;
        points = 0;
    }

    // Returns the player's name
    public String getName() {
        return name;
    }

    // Returns the players points - the point value of all the cards  in the player's hand
    public int getPoints() {
        return points;
    }

    // Returns the player's full hand
    public ArrayList<Card> getHand() {
        return hand;
    }

    // Method adds points to total
    public void addPoints(int add)
    {
        points += add;
    }

    // Method adds a new card to the player's hand, and updates the player's points
    public void addCard (Card newCard)
    {
        hand.add(newCard);
        points += newCard.getValue();
    }

    //Method returns the player's name, points, and hand
    public String toString(String name, ArrayList<Card> hand, int points){
        return name + " has " + points + " points" + "/n" + name + "'s cards: " + hand;
    }
}
