package Irretors.Irretors.ComparingObjects.StrategyPattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));

        Set<Person> peopleName = new TreeSet<Person>(new PersonComparator());
        Set<Person> peopleAge = new TreeSet<Person>(new PersonComparatorSecond());
        //TreeSet<Person> peopleName=new TreeSet<>();
        //TreeSet<Person> peopleAge=new TreeSet<>();

        int n=Integer.parseInt(reader.readLine());

        for(int i=0;i<n;i++)
        {
            String[] line=reader.readLine().split("\\s+");
            Person person=new Person(line[0],Integer.parseInt(line[1]));


            peopleName.add(person);
            peopleAge.add(person);
        }

        for (Person person : peopleName) {
            System.out.printf("%s %s%n",person.getName(),person.getAge());


        }
        for (Person person : peopleAge) {
            System.out.printf("%s %s%n",person.getName(),person.getAge());


        }

    }
}
