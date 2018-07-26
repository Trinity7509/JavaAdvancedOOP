package Irretors.Irretors.ComparingObjects.Froggy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));

        Lake lake = new Lake(Stream.of(reader.readLine()
                .split("[,\\s]+")).map(Integer::parseInt).toArray(Integer[]::new));

        StringBuilder sb=new StringBuilder();

        for (Integer integer : lake) {
            sb.append(integer).append(", ");

        }
        System.out.println(sb.substring(0,sb.length()-2));

    }
}
