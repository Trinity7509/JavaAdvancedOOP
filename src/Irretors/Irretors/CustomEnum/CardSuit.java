package Irretors.Irretors.CustomEnum;

@EnumAnnotation(type = "Enumeration", category = "Suit",description = "Provides suit constants for a Card class.")
public enum CardSuit {

    CLUBS(0), DIAMONDS(13),HEARTS(26),SPADES(39);

    private int power;

    CardSuit(int power) {
        this.power=power;
    }

    public int getPower() {
        return this.power;
    }
}