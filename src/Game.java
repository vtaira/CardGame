import java.util.Scanner;

public class Game {
    private Player you;
    private Player dealer;
    private  Deck gameDeck;
    private int bettingMoney;


    public Game() {
       you = new Player("You");
       dealer = new Player("dealer");
       this.bettingMoney = 100;
       String[] ranks = {"A", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
       String[] suits = {"Hearts", "Spades", "Clubs", "Diamonds"};
       int[] values = {1, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10};

       this.gameDeck = new Deck(ranks, suits, values);
       gameDeck.shuffle();



    }

    public void printInstructions(){
        System.out.println("Welcome to my game of Blackjack! Thank you so much for playing. Here are the rules /n ");
    }

    public void playGame(){
        Scanner input = new Scanner(System.in);
        you.addCard(gameDeck.deal());
        you.addCard(gameDeck.deal());




        dealer.addCard(gameDeck.deal());
        dealer.addCard(gameDeck.deal());


        System.out.println("Your hand: " + you.getHand());
        System.out.println("Dealer's hand: " + dealer.hand.getFirst());
        if(you.getPoints() == 21 && dealer.getPoints() != 21)
        {
            System.out.println("Natural! You win!");
            return;
        }
        else if(dealer.getPoints() == 21 && you.getPoints() != 21)
        {
            System.out.println("Dealer has blackjack - dealer wins!");
            return;
        }

        while (true) {
            System.out.println("You have:" + you.getHand());
            System.out.println("Do you want to hit or stand?");
            String yourChoice = input.nextLine();
            if (yourChoice.equals("hit")) {
                you.addCard(gameDeck.deal());
                System.out.println("you drew a " + you.hand.getLast());
                if (you.getPoints() > 21) {
                    System.out.println("You busted! The Dealer wins!");
                    return;
                }
            } else if (yourChoice.equals("stand")) {
                break;
            }
        }

        System.out.println("Dealer's turn:");
            while(dealer.getPoints() < 17)
            {
                dealer.addCard(gameDeck.deal());
                System.out.println("Dealer draws a " + dealer.hand.getLast());
            }
            System.out.println("Dealer's hand: " + dealer.getHand());
            System.out.println("Your hand: " + you.getHand());
            if(dealer.getPoints() > 21)
            {
                System.out.println("Dealer busts! You win!");
            }
            else if (you.getPoints() > dealer.getPoints())
            {
                System.out.println("You win!");
            }
           else if (dealer.getPoints() > you.getPoints()){
                System.out.println("Dealer wins!");
            }
            else{
                System.out.println("It's a tie!");
            }

        }
    public void main(String[] args) {
        Game game1 = new Game();
        game1.printInstructions();
        game1.playGame();

    }
}

