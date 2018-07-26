package Irretors.Irretors.ComparingObjects.StackIterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class StackIterator implements Iterable<Integer>{

    private List<Integer> items;
    //private static int IN_CAP=16;

    public StackIterator() {
        this.items = new ArrayList<>();
    }

    public void push(Integer...elements)
    {


        this.items.addAll(Arrays.asList(elements));
    }

    public int pop()
    {
        if (this.items.size()<=0)
        {
            throw new IllegalStateException("No elements");

        }
        return this.items.remove(this.items.size()-1);
    }


    @Override
    public Iterator<Integer> iterator() {
        return new CustomIterator();
    }

    private class CustomIterator implements Iterator<Integer> {

        private int counter;

        private CustomIterator() {
            this.counter = items.size()-1;
        }

        @Override
        public boolean hasNext() {
            return this.counter>=0;
        }

        @Override
        public Integer next() {
            return items.get(this.counter--);
        }
    }
}
