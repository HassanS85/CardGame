

// Unicodes:

//Black Spade Suit (picas) U+2660
//Black Heart Suit (corazones) U+2665
//Black Diamond Suit (diamante) U+2666
// Black Club Suit (trebol) "U+2663"

class Card {
    private String suit;
    private String symbol;
    private int value;

    public Card(String suit, String symbol, int value) {
        this.suit = suit;
        this.symbol = symbol;
        this.value = value;
    }

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String toString() {

        String cardName = this.symbol + " of " + this.suit;
        return cardName;
    }
}
