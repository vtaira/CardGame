import java.util.Scanner;

public class Game {
    // Instance variables
    private Player you;
    private Player dealer;
    private  Deck gameDeck;

    // Constructor
    public Game() {
       you = new Player("You");
       dealer = new Player("dealer");
       // Creates the arrays for ranks, suits, and values, and fills them with Strings & integers
       String[] ranks = {"A", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
       String[] suits = {"Hearts", "Spades", "Clubs", "Diamonds"};
       int[] values = {11, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10};

       // Creates a game deck with the initialized arrays, and shuffles the deck
       this.gameDeck = new Deck(ranks, suits, values);
       gameDeck.shuffle();
    }

    // Prints instructions for game
    public void printInstructions(){
        System.out.println("Welcome to my game of Blackjack! Thank you so much for playing. Here are the rules: ");
    }

    // Plays a game of Blackjack
    public void playGame(){
        Scanner input = new Scanner(System.in);

        // Adds two cards to both the player and dealer's hand
        you.addCard(gameDeck.deal());
        you.addCard(gameDeck.deal());

        dealer.addCard(gameDeck.deal());
        dealer.addCard(gameDeck.deal());

        // Prints out your hand & the dealer's hand
        // If either one is dealt Blackjack, the game ends
        System.out.println("Your hand: " + you.getHand());
        System.out.println("Dealer's hand: " + dealer.hand.getFirst());

        // If player is dealt Blackjack, and dealer is not, player wins
        if(you.getPoints() == 21 && dealer.getPoints() != 21)
        {
            System.out.println("Natural! You win!");
            return;
        }

        // If dealer is dealt Blackjack, and player is not, dealer wins
        else if(dealer.getPoints() == 21 && you.getPoints() != 21)
        {
            System.out.println("Dealer has blackjack - dealer wins!");
            return;
        }

        // Game loop that runs while the player keeps hitting
        while (true) {
            System.out.println("You have:" + you.getHand());
            System.out.println("Do you want to hit or stand?");
            String yourChoice = input.nextLine();

            // If the player chooses to hit, a card is drawn and added to their hand
            if (yourChoice.equals("hit")) {
                you.addCard(gameDeck.deal());
                System.out.println("you drew a " + you.hand.getLast());

                // If the player's points value is over 21:
                // Loops through the player's hand
                // If there is an ace in the player's hand, the value of the ace becomes 1
                if (you.getPoints() > 21) {
                    for(Card card : you.hand)
                    {
                        if(card.getRank().equals("A") && card.getValue() == 11)
                        {
                            card.setValue(1);

                            // If the player's point total becomes less than or equal to 21, the loop breaks
                            if(you.getPoints() <= 21)
                            {
                                break;
                            }
                        }
                    }
                }
                // If the player draws a card that makes their hand value go over 21, the loop returns
                // The game is over
                if(you.getPoints() > 21)
                {
                    System.out.println("You busted! The Dealer wins!");
                    return;
                }
            // If the player chooses to stand, the loop breaks
            } else if (yourChoice.equals("stand")) {
                break;
            }
        }

        // Runs the dealer's turn
        System.out.println("Dealer's turn:");

        // While the dealer's points are under 17, the dealer keeps drawing cards
        while(dealer.getPoints() < 17)
            {
                dealer.addCard(gameDeck.deal());
                System.out.println("Dealer draws a " + dealer.hand.getLast());
            }
            // Prints out the player & dealer's hands
            System.out.println("Dealer's hand: " + dealer.getHand());
            System.out.println("Your hand: " + you.getHand());

            // If the dealer draws a card that puts them over 21 points, the dealer busts
            // The game is over
            if(dealer.getPoints() > 21)
            {
                System.out.println("Dealer busts! You win!");
            }

            // If neither player has over 21 points
            // If the player has more points than the dealer, the player wins
            else if (you.getPoints() > dealer.getPoints())
            {
                System.out.println("You win!");
            }

            // If the dealer has more points than the player, the dealer wins
           else if (dealer.getPoints() > you.getPoints()){
                System.out.println("Dealer wins!");
            }

           // If the player & dealer's point totals are equal, they tie
            else{
                System.out.println("It's a tie!");
            }

        }

    // Main method where the game is created and called
    public void main(String[] args) {
        // Creates new game object
        Game game1 = new Game();
        // Prints game instructions
        game1.printInstructions();
        // Plays the game
        game1.playGame();

    }
}

