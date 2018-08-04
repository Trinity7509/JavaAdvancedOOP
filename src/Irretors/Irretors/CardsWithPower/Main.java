package Irretors.Irretors.CardsWithPower;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String rank = reader.readLine();
        String suit = reader.readLine();
        RankCard cardRank = RankCard.valueOf(rank);
        Cards cardSuit = Cards.valueOf(suit);
        int power = cardRank.getPower() + cardSuit.getPower();
        System.out.printf("Card name: %s of %s; Card power: %d%n", cardRank.name(), cardSuit.name(), power);




    }
}
