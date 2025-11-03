import java.util.*;
public class Card
{
    private final int face;
    private final int suit;

    private final String[] faces = {null, "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
    private final String[] suits = {null, "Spades", "Hearts", "Clubs", "Diamonds"};

    public Card(int face, int suit){
        this.face = face;
        this.suit = suit;
    }
    public int getFace(){
        return face;
    }
    public int getSuit(){
        return suit;
    }
    public String toString(){
        return faces[face] + " of " + suits[suit];
    }
}
