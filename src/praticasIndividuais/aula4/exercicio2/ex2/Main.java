package praticasIndividuais.aula4.exercicio2.ex2;

public class Main {

    public static void main(String[] args) {

        Counter contador = new Counter();

        for (int i = 0; i < 5; i ++) {
            contador.add();
        }

        System.out.println(contador);
        contador.subtract();
        System.out.println(contador);

        Counter contador2 = new Counter(4);
        contador2.add();
        System.out.println(contador2);

        Counter contador3 = new Counter(contador2);
        System.out.println(contador2);
    }
}
