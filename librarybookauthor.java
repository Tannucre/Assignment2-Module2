import java.util.Scanner;

class Author {
    private String name, email;
    private char gender;

    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Author: " + name + " (" + gender + "), Email: " + email;
    }
}

class Book {
    private String title;
    private int price;
    private Author author;

    public Book(String title, int price, Author author) {
        this.title = title;
        this.price = price;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book: " + title + "\nPrice: " + price + "\n" + author;
    }
}

public class librarybookauthor {
    public static void main(String[] args) {
        String[] p = new Scanner(System.in).nextLine().split(",\\s*");
        Author a = new Author(p[2], p[3], p[4].charAt(0));
        System.out.println(new Book(p[0], Integer.parseInt(p[1]), a));
    }
}