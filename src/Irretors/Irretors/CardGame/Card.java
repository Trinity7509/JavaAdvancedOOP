package Irretors.Irretors.CardGame;

public class Card implements Comparable<Card>{
    private CardRank cardRank;
    private CardSuit cardSuit;

    public Card(CardRank cardRank, CardSuit cardSuit) {
        this.cardRank = cardRank;
        this.cardSuit = cardSuit;
    }

    public int getPower()
    {
        return this.cardRank.getPower()+this.cardSuit.getPower();
    }


    @Override
    public int compareTo(Card o) {
        return Integer.compare(this.getPower(),o.getPower());
    }

    @Override
    public String toString() {
        return String.format("%s of %s",this.cardRank.name(),this.cardSuit.name());
    }
}
