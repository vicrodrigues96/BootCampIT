package praticasIndividuais.aula4.exercicio2.ex4;

public class Main {

    public static void main(String[] args) {

        Fracao fracao1 = new Fracao(2, 13);
        Fracao fracao2 = new Fracao(5, 7);

        fracao1.multiplicacao(fracao2);

        System.out.println(fracao1);
    }
}
