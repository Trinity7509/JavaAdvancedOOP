package Irretors.Irretors.DeckCards;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));

        List<Card> cards=new ArrayList<>();
        CardRank[]cardRanks=CardRank.values();
        CardSuit[]cardSuits=CardSuit.values();



            for (CardSuit suit : cardSuits) {
                for (CardRank rank : cardRanks) {
                Card newCard=new Card(rank,suit);
                cards.add(newCard);

            }
            }
        for (Card cardNew : cards) {
            System.out.println(cardNew);

        }
            
        }
    }

