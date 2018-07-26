package Irretors.Irretors.ComparingObjects.Lab;

import java.util.Comparator;

public class BookComparator implements Comparator<Book> {

    @Override
    public int compare(Book bookOne, Book bookTwo) {
        if (bookOne.getTitle().compareTo(bookTwo.getTitle()) == 0) {
            if (bookOne.getYear() > bookTwo.getYear())
            {
                return 1;
            }
            else if(bookOne.getYear() <bookTwo.getYear())
            {
                return -1;
            }
            return 0;
        }
        else
        {
            return bookOne.getTitle().compareTo(bookTwo.getTitle());
        }
    }
}
