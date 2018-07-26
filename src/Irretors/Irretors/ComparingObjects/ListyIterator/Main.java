package Irretors.Irretors.ComparingObjects.ListyIterator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] tokens = reader.readLine().split("\\s+", 2);
        tokens = tokens.length > 1 ? tokens[1].split("\\s+") : new String[0];

        ListyIterator<String> iterator = new ListyIterator<>(tokens);

        for (String line = reader.readLine(); !line.equals("END"); line = reader.readLine()) {
            tokens = line.split("\\s+");
            String command = tokens[0];

            try {
                switch (command) {


                    case "Move":
                        System.out.println(iterator.move());
                        break;
                    case "HasNext":
                        System.out.println(iterator.hasNext());
                        break;
                    case "Print":
                        iterator.print();
                        break;
                    case "PrintAll":
                        iterator.printAll();
                        break;
                }
            }
                catch (IllegalAccessError e)
                {
                    System.out.println(e.getMessage());
                }

        }
    }
}
