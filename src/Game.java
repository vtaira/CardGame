import java.util.Scanner;

public class Game {
    private Player you;
    private Player dealer;
    private Deck deck;


    public Game (Player you, Player dealer, Deck deck){
        Scanner input = new Scanner (System.in);
        System.out.println("Enter Player name: ");
        String playerName = input.nextLine();
        you = new Player(playerName);
        dealer = new Player("dealer");
        String[] ranks = {"A", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        String[] suits = {"Hearts", "Spades", "Clubs", "Diamonds"};
        int[] values = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

        deck = new Deck(ranks, suits, values);



    }
}
