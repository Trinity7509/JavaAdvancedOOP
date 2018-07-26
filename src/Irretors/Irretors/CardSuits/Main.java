package Irretors.Irretors.CardSuits;


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));

        Cards[] cards=Cards.values();

        System.out.println("Card Suits:");
        for (Cards card : cards) {
            System.out.printf("Ordinal value: %d; Name value: %s%n",card.ordinal(),card.name());

        }
    }

}
