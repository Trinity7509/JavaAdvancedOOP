package Irretors.Irretors.CardsWithPower;

public class Card implements Comparable<Card>{
    private RankCard rankCard;
    private Cards cards;

    public Card(String rankCard, String cards) {
        this.rankCard =RankCard.valueOf( rankCard);
        this.cards =Cards.valueOf( cards);
    }

    public int getPower()
    {
        return this.rankCard.getPower()+this.cards.getPower();
    }



    @Override
    public int compareTo(Card o) {

            return Integer.compare(this.getPower(),o.getPower());
        }


    @Override
    public String toString() {
        return String.format("Card name: %s of %s; Card power: %d%n",this.rankCard.name(),this.cards.name(),this.getPower() );
    }
}
