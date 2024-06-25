package src.list.research.bookcatalog;

import java.util.ArrayList;
import java.util.List;

public class BookCatalog {

    private List<Book> books = new ArrayList<>();


    public void addBook(String title, String author, int yearPublication){
        books.add(new Book(title, author, yearPublication));
    }

    public List researchByAuthor(String author){
        List<Book> booksAuthor = new ArrayList<>();

        for (Book b : books) {
            if (b.getAuthor().equals(author)){
                booksAuthor.add(b);
            }
        }

        return booksAuthor;
    }

    public List researchByIntervalYears(int initYear, int finalYear){
        List<Book> booksYear = new ArrayList<>();

        for (Book b : books) {
            if (b.getYearPublication() >= initYear && b.getYearPublication() <= finalYear){
                booksYear.add(b);
            }
        }

        return booksYear;
    }

    public Book researchByTitle(String title){
        for (Book b : books) {
            if (b.getTitle().equals(title)){
                return b;
            }
        }

        return null;
    }

}
