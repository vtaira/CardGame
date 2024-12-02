import java.util.ArrayList;
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
        System.out.println("Dealer's hand:" + dealer.getHand().get(0));
        while (true){

        }

    }

    public static void main(String[] args) {
        Game game1 = new Game();
        game1.printInstructions();
        game1.playGame();

    }
}
