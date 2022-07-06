

// Unicode:
//Black Spade Suit  U+2660
//Black Heart Suit  U+2665
//Black Diamond Suit  U+2666
// Black Club Suit  "U+2663"

import java.util.ArrayList;
import java.util.List;

class CardGame {
    String[] suits = {"\u2660", "\u2665", "\u2666", "\u2666"};
    String[] symbols = {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
    int[] values ={2,3,4,5,6,7,8,9,10,11,12,13,14};
    private static ArrayList<Card> deckOfCards = new ArrayList<Card>();
    private ArrayList<Card> TempDeckOfCards = new ArrayList<Card>();


    public CardGame() {
        this.deckOfCards = deckOfCards;
        this.TempDeckOfCards = TempDeckOfCards;
    }

    public void generateDeck(){

        for (String suit: suits){
            for (int j = 0; j <symbols.length;j++){
                Card myCard  = new Card(suit, symbols[j], values[j]);
                deckOfCards.add(myCard);
                TempDeckOfCards.add(myCard);
            }

        }
        System.out.println(TempDeckOfCards);

    }

    public void getDeck(){
        for(Card cards: deckOfCards){
            System.out.println(cards);
        }
    }
    public void getFirstCard(){
        System.out.println(deckOfCards.get(0));
    }


    public static void shuffleDeck(){
        List shuffledDeck = new ArrayList<>();

        while (deckOfCards.size() != 0) {
            int randomCard = (int) (Math.random() * deckOfCards.size());
            System.out.println(randomCard);
            shuffledDeck.add(deckOfCards.get(randomCard));
            deckOfCards.remove(randomCard);

        }

        deckOfCards = (ArrayList<Card>) shuffledDeck;
    }



}