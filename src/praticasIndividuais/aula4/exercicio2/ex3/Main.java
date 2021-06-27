package praticasIndividuais.aula4.exercicio2.ex3;

public class Main {

    public static void main(String[] args) throws Exception {

        Book book1 = new Book();
        book1.setAuthor("Rowling, J. K.");
        book1.setAvailable(true);
        book1.setIsbn("9780545582889");
        book1.setTitle("Harry Potter");

        book1.rent();
        System.out.println(book1);
        book1.returnBook();
        System.out.println(book1);
        book1.rent();
        System.out.println(book1);
    }
}
