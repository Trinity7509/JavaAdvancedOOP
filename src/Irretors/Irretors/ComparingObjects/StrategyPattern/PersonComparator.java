package Irretors.Irretors.ComparingObjects.StrategyPattern;

import java.util.Comparator;

public class PersonComparator implements Comparator<Person> {
    @Override
    public int compare(Person person1, Person person2) {

            int comp = Integer.compare(person1.getName().length(), person2.getName().length());
            if (comp == 0) {
                comp = Character.compare(person1.getName().toLowerCase().charAt(0),person2.getName().toLowerCase().charAt(0));
            }

        return comp;
        }
    }

