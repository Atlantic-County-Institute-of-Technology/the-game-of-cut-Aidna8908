import java.util.*;

public class Main {
    public static void main(String[] args) {
        int wins = 0;
        int winsai = 0;
        Card[] deck = Deck.createFullDeck();
        Scanner inputScanner = new Scanner(System.in);

        while(wins < 3 && winsai < 3) {
            Deck.shuffle(deck);

            System.out.print("Enter your card # (1-52): ");
            int card = inputScanner.nextInt() - 1;

            if (card < 0 || card >= deck.length) {
                System.out.println("Invalid card number. Try again.");
                continue;
            }

            Card cardO = deck[card];
            System.out.println("Your card is " + cardO);

            Random random = new Random();
            int ai;
            ai = random.nextInt(deck.length - 1);
            if (ai >= card) {
                ai++;
            }

            Card aiO = deck[ai];
            System.out.println("Your enemy's card is " + aiO);

            if (cardO.getFace() > aiO.getFace()) {
                System.out.println("You win");
                wins++;
            } else if (cardO.getFace() < aiO.getFace()) {
                System.out.println("You lose");
                winsai++;
            } else {
                if (cardO.getSuit() > aiO.getSuit()) {
                    System.out.println("You lose");
                    winsai++;
                } else {
                    System.out.println("You win");
                    wins++;
                }
            }
            System.out.println("Score: You: " + wins + " Enemy: " + winsai);
        }

        if (wins == 3) {
            System.out.println("Congratulations, you won best of 5!");
        } else {
            System.out.println("AI wins best of 5. Better luck next time!");
        }
    }
}