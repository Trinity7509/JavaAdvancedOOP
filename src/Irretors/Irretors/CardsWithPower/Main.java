package Irretors.Irretors.CardsWithPower;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String cards=reader.readLine();
        String ranks=reader.readLine();

    Cards cards1 = Cards.valueOf(cards);
    RankCard rankCard = RankCard.valueOf(ranks);
    int maxPower = cards1.getPower() + rankCard.getStrong();
        try {
    System.out.printf("Card name: %s of %s; Card power: %d"
            , cards1.name(), rankCard.name(), maxPower);

}
catch(IllegalArgumentException ignored){
    ;
}


    }
}
