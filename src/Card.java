


import java.util.ArrayList;

//Black Spade Suit (Spade) U+2660
//Black Heart Suit (Hearts) U+2665
//Black Diamond Suit (Diamonds) U+2666
// Black Club Suit (Club) "U+2663"



class CardGame {
    String[] suits = {"\u2660", "\u2665", "\u2666", "\u2666"};
    String[] symbols = {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
    int[] values ={2,3,4,5,6,7,8,9,10,11,12,13,14};
    private ArrayList<cardGame.Card> deckOfCards = new ArrayList<cardGame.Card>();
    private ArrayList<cardGame.Card> TempDeckOfCards = new ArrayList<cardGame.Card>();


    public CardGame() {
        this.deckOfCards = deckOfCards;
        this.TempDeckOfCards = TempDeckOfCards;
    }

    public void generateDeck(){

        for (String suit: suits){
            for (int j = 0; j <symbols.length;j++){
                cardGame.Card myCard  = new cardGame.Card(suit, symbols[j], values[j]);
                deckOfCards.add(myCard);
                TempDeckOfCards.add(myCard);
            }

        }
        System.out.println(TempDeckOfCards);

    }

    public void getDeck(){
        for(cardGame.Card cards: deckOfCards){
            System.out.println(cards);
        }
    }
    public void getFirstCard(){
        System.out.println(deckOfCards.get(0));
    }




}