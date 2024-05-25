package Week5;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Book implements Comparable <Book> {
    private String name;
    private String author;
    private int page;
    private int date;

    public Book(String name, String author, int page, int date) {
        this.name=name;
        this.author=author;
        this.page=page;
        this.date=date;
    }

    @Override
    public int compareTo(Book other) {
        return this.name.compareTo(other.name);
    }

    public String getName() {
        return name;
    }
    public String getAuthor() {
        return author;
    }
    public int getPage() {
        return page;
    }
    public int getDate() {
        return date;
    }

    public String toString() {
        return "Kitap adı: " + name + ", Yazar: " + author + ", Sayfa Sayısı: " + page + ", Basım Yılı: " + date;
    }


    public static void main (String[] args) {

        Book b1 = new Book("Balıkçı ve Oğlu","Zülfü Livaneli",140,2021);
        Book b2 = new Book("Satranç","Stefan Zweig",100,2012);
        Book b3 = new Book("Northanger Manastırı","Jane Austen",230,2006);
        Book b4 = new Book("Hayvan Çiftliği","George Orwell",160,2008);
        Book b5 = new Book("Yeraltından Notlar","Dostoyevski",145,2005);

        Set<Book> books= new TreeSet<>();
        books.add(b1);
        books.add(b2);
        books.add(b3);
        books.add(b4);
        books.add(b5);

        System.out.println("Alfabetik Sıraya Göre Kitaplar: ");
        for (Book book: books) {
            System.out.println(book);
        }

        Set <Book> booksByPage = new TreeSet<>(new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return Integer.compare(o1.getPage(), o2.getPage());
            }
        });

        booksByPage.add(b1);
        booksByPage.add(b2);
        booksByPage.add(b3);
        booksByPage.add(b4);
        booksByPage.add(b5);

        System.out.println("******************************************************************************************");

        System.out.println("Sayfa Sayısına Göre Kitaplar: ");
        for (Book page: books) {
            System.out.println(page);
        }
    }
}
