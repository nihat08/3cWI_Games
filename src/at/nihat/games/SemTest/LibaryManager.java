package at.nihat.games.SemTest;

import at.nihat.games.tests.Abstract;

import java.util.ArrayList;
import java.util.List;

public class LibaryManager {
    private List<AbstractBook> books = new ArrayList<AbstractBook>();

    public void getAllMedia(){
        for (AbstractBook book : books){
            System.out.println("Title: " + book.getTitel() + ", " + "Id: " + book.getId());
        }
    }
    public void calculateTotalMediaValue(){
        for (AbstractBook book : books){
            System.out.println("Preis " + book.getPrice() + ", " +
                    "Id "+ book.getId());
        }
    }
    public void addMedia(AbstractBook book){
        books.add(book);
    }

    /*public void getAllMedia(AbstractBook book){
        books.get(book);
    }*/

}
