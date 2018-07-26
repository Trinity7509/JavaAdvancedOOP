package Irretors.Irretors.ComparingObjects.ListyIterator;

import java.util.Iterator;

public class ListyIterator<T> implements Iterable<T>{
    private T[] items;
    private int pointer;

    public ListyIterator(T... items) {
        this.items = items;
    }

    public boolean move() {
        if (this.pointer < this.items.length - 1) {
            this.pointer++;
            return true;
        }
        return false;
    }

    public boolean hasNext() {
        return this.pointer < this.items.length - 1;
    }

    public void print() {
        if (this.items.length == 0 || this.pointer >= this.items.length) {
            System.out.println("Invalid Operation!");
            return;
        }
        System.out.println(this.items[this.pointer]);
    }

    public void printAll()
    {
        for (T item : items) {
            System.out.print(item+" ");
        }
        System.out.println();
    }


    @Override
    public Iterator<T> iterator() {
        return new CustomIterator();
    }

    private class CustomIterator implements Iterator<T> {

        public int counter=0;
        @Override
        public boolean hasNext() {
            return this.counter<items.length;
        }

        @Override
        public T next() {
            return items[counter++];
        }
    }
}