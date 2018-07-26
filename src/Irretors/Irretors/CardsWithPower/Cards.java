package Irretors.Irretors.CardsWithPower;

public enum Cards {

    CLUBS(0), DIAMONDS(13),HEARTS(26),SPADES(39);

    private int power;

    Cards(int power) {
        this.power=power;
    }

    public int getPower() {
        return this.power;
    }
}