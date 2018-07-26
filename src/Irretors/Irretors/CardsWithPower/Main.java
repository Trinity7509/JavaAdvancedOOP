package Irretors.Irretors.CardsWithPower;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String cards=reader.readLine();
        String ranks=reader.readLine();
try {
    Cards cards1 = Cards.valueOf(cards.toUpperCase());
    RankCard rankCard = RankCard.valueOf(ranks.toUpperCase());
    int maxPower = cards1.getPower() + rankCard.getStrong();

    System.out.printf("Card name: %s of %s; Card power: %d"
            , cards1.name(), rankCard.name(), maxPower);

}
catch(IllegalArgumentException ignored){
    ;
}


    }
}
