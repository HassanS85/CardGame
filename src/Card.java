import java.util.ArrayList;

//Black Spade Suit (Spade) U+2660
//Black Heart Suit (Hearts) U+2665
//Black Diamond Suit (Diamonds) U+2666
// Black Club Suit (Club) "U+2663"


class CardGame {
    String[] suits = {"\u2660", "\u2665", "\u2665", "\u2663"};
    String[] symbols = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
    int[] values = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
    private ArrayList<Card> deckOfCards = new ArrayList<Card>();
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


}