package Irretors.Irretors.ComparingObjects.StrategyPattern;

import java.util.Comparator;

public class PersonComparatorSecond implements Comparator<Person> {
    @Override
    public int compare(Person x, Person y) {
        int comp = Integer.compare(x.getAge(), y.getAge());
        if (comp == 0) {
            return 0;
        } else {
            return comp;
        }
    }
}