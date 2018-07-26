package Irretors.Irretors.ComparingObjects;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        List<Person> persons= new ArrayList<>();
        int counter=0;


        while(true)
        {

            String[] line = reader.readLine().split("\\s+");
            if(line[0].equals("END"))
            {
                break;
            }



            Person person = new Person(line[0], Integer.parseInt(line[1]), line[2]);

            persons.add(person);
        }
        int size=persons.size();

        int numbers =Integer.parseInt(reader.readLine());

        Person person=persons.get(numbers-1);

        for (Person person1 : persons) {
            if(person.compareTo(person1)==0)
            {
                counter++;
            }

        }
        if(counter==1)
        {
            System.out.println("No matches");
        }

else
        {
            System.out.printf("%s %s %s",counter,size-counter,size);
        }



    }
}