import java.util.*;
public class Deck {
    public static Card[] createFullDeck() {
        int i = 0;
        Card[] deck = new Card[52];
            for (int suit = 1; suit <= 4; suit++) {
                for (int face = 1; face <= 13; face++) {
                    deck[i] = (new Card(face, suit));
                    i++;
                }
            }
    return deck;
    }
    public static Card[] shuffle(Card[] deck) {
        Random rand = new Random();
        for (int i = 0; i < deck.length; i++) {
            int randomIndexToSwap = rand.nextInt(deck.length - i) + i;
            Card temp = deck[randomIndexToSwap];
            deck[randomIndexToSwap] = deck[i];
            deck[i] = temp;
        }
        return deck;
    }
}