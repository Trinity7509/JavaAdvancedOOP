package Irretors.Irretors.ComparingObjects.StackIterator;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        StackIterator stack = new StackIterator();

        //ArrayDeque<Integer> stack =new ArrayDeque<>();


        for (String line = reader.readLine(); !line.equals("END"); line = reader.readLine()) {
            String[]tokens = line.split(", | ");
            String command = tokens[0];
try{
            switch (command) {
                case "Push":

                    stack.push(Stream.of(tokens).skip(1).map(Integer::parseInt).toArray(Integer[]::new));

                    break;
                case "Pop":
                    stack.pop();
                    break;


            }
}
catch (IllegalStateException e)
            {
                System.out.println(e.getMessage());
            }
        }
        for (Integer integer : stack) {
            System.out.println(integer);

        }
        for (Integer integer : stack) {
            System.out.println(integer);

        }
    }
}
