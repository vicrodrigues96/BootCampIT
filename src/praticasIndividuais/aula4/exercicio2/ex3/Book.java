package praticasIndividuais.aula4.exercicio2.ex3;

public class Book {

    private String title;
    private String author;
    private String isbn;
    private boolean available = true;

    public Book() {

    }

    public Book(String title, String author, String isbn, boolean available) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.available = available;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public void rent() throws Exception {
        if (!available) {
            throw new Exception("Book is unavailable");
        }

        this.available = false;
    }

    public void returnBook() {
        this.available = true;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title = '" + title + '\'' +
                ", author = '" + author + '\'' +
                ", isbn = " + isbn +
                ", available = " + available +
                '}';
    }
}
