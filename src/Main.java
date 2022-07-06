
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Card card = new Card("Spade","6",6);
        System.out.println(card.toString());

        CardGame deck = new CardGame();
        CardGame shuffleddeck = new CardGame();

        deck.generateDeck();
//    deck.getDeck();
        deck.getFirstCard();
        shuffleddeck.shuffleDeck();
    }
}

