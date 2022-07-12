
// Unicode:
//Black Spade Suit  U+2660
//Black Heart Suit  U+2665
//Black Diamond Suit  U+2666
// Black Club Suit  "U+2663"

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

//setup a new class here called cardGame
//create strings and ints of the symbols, suits and values of the cards

class cardGame {
    String[] suits = {"\u2660", "\u2665", "\u2666", "\u2663"};
    String[] symbols = {"2","3","4","5","6","7","8","9","10","JACK","QUEEN","KING","ACE"};
    int[] values ={2,3,4,5,6,7,8,9,10,11,12,13,14};


    private static List<Card> deckOfCards = new ArrayList<>();
    private List<Card> TempDeckOfCards = new ArrayList<>();


    public cardGame() {
        this.deckOfCards = deckOfCards;
        //this.TempDeckOfCards = TempDeckOfCards;
    }

    public void generateDeck(){

        for (String suit: suits){
            for (int j = 0; j <symbols.length;j++){
                Card myCard  = new Card(suit, symbols[j], values[j]);
                deckOfCards.add(myCard);
                //TempDeckOfCards.add(myCard);
            }

        }
        //System.out.println(TempDeckOfCards);

    }

    public void getDeck(){
        for(Card cards: deckOfCards){
            System.out.println(cards);
        }
    }
    public void getFirstCard(){
        System.out.println(deckOfCards.get(0));
    }



    public void shuffleDeck(){
        Collections.shuffle(deckOfCards);
        System.out.println(deckOfCards);}



    public void sortDeckIntoSuits(){
//sorted into number order initially, then sorts by suit.
        deckOfCards  =  deckOfCards.stream()
                .sorted()
                .sorted(Comparator.comparing(Card::getSuit))
                .collect(Collectors.toList());
        System.out.println(deckOfCards);

    }
//stream to get deck of cards, sort, then add to a list
    public void sortDeckInNumberOrder(){

        deckOfCards =  deckOfCards.stream()
                .sorted()
                .collect(Collectors.toList());

        System.out.println(deckOfCards);


    }


}





