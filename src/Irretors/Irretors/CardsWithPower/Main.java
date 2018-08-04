package Irretors.Irretors.CardsWithPower;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String rank = reader.readLine();
        String suit = reader.readLine();

        Card cardOne=new Card(rank,suit);

        String rank2 = reader.readLine();
        String suit2 = reader.readLine();

        Card cardTwo=new Card(rank2,suit2);

        Card greaterCard=cardOne.compareTo(cardTwo)>0 ? cardOne:cardTwo;


        System.out.println(greaterCard);




    }
}
