package Irretors.Irretors.CardRank;

public class Main {
    public static void main(String[] args) {
        CardRank[] ranks=CardRank.values();

        System.out.println("Card Ranks:");
        for (CardRank rank : ranks) {
            System.out.printf("Ordinal value: %d; Name value: %s%n",rank.ordinal(),rank.name());

        }
    }
}
