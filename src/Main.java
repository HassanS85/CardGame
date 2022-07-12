import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Collectors;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Card card = new Card("Spade","6",6);
        System.out.println(card.toString());

        cardGame deck = new cardGame();

        deck.generateDeck();
        deck.getDeck();
        deck.getFirstCard();
        //deck.shuffleDeck();
        deck.sortDeckInNumberOrder();
        deck.sortDeckIntoSuits();
        deck.shuffleDeck();

    }
}


