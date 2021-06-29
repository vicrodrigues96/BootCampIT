package praticasIndividuais.aula3.exercicio1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ex1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a quantidade de números pares");
        int n = scanner.nextInt();
        List<Integer> listaDeNumeros = new ArrayList<>();
        for (int i = 0, counter = 0; counter < n; i++) {
            if (i % 2 == 0) {
                listaDeNumeros.add(i);
                counter++;
            }
        }
        System.out.println(listaDeNumeros);
    }
}
