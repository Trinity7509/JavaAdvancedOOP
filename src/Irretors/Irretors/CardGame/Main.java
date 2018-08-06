package Irretors.Irretors.CardGame;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));

        Map<String,Card> cards=new HashMap<>();

        String firstName=reader.readLine();
        String secondName=reader.readLine();

        boolean firstPlayerWins=false;
        Card bestCard=null;

        while(cards.size()<10)
        {
            String cardsName=reader.readLine();

            try {
                String[] rankAndSuit = cardsName.split("\\s+of\\s+");

                CardRank cardRank = CardRank.valueOf(rankAndSuit[0]);
                CardSuit cardSuit = CardSuit.valueOf(rankAndSuit[1]);

                if (!cards.containsKey(cardsName)) {
                    Card newCard = new Card(cardRank, cardSuit);

                    int power = newCard.getPower();

                    if (bestCard == null || power > bestCard.getPower()) {
                        bestCard = newCard;
                        firstPlayerWins = cards.size() <= 5;

                    }

                    cards.put(newCard.toString(), newCard);
                } else {
                    System.out.println("Card is not in the deck.");
                }
            }
            catch(IllegalArgumentException e)
                {
                    System.out.println("No such card exists.");
                }
            }
            String end=String.format(" wins with %s.",bestCard);
            String output=firstPlayerWins?firstName + end:secondName+end;
            System.out.println(output);
        }




    }

