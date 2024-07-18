package src.map.Ordering.Books;

import java.util.*;

public class OnlineBookstore {

    private Map<String, Book> books = new HashMap<>();

    public void addBook(String link, String title, String author, double price){
        books.put(link, new Book(title, author, price));
    }

    public void removeBook(String title){
        for (Map.Entry<String, Book> entry : books.entrySet()) {
            if (entry.getValue().equals(title)){
                books.remove(entry.getKey());
            }
        }
    }

    public void showBooksOrderedByPrice(){
        List<Book> bookList = new ArrayList<>(books.values());
        Collections.sort(bookList);

        for (Book b : bookList) {
            System.out.println(b);
        }
    }

    public List<Book> researchBooksByAuthor(String author){
        List<Book> authorBooks = new ArrayList<>();

        for (Map.Entry<String, Book> entry : books.entrySet()) {
            if (entry.getValue().getAuthor().equalsIgnoreCase(author)){
                authorBooks.add(entry.getValue());
            }
        }

       return authorBooks;
    }

    public Book getMostExpensiveBook(){
        return Collections.max(books.values());
    }

    public Book getCheapestBook(){
        return Collections.min(books.values());
    }

}
