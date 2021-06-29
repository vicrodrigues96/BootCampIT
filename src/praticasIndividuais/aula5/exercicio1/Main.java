package praticasIndividuais.aula5.exercicio1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Precedente p1 = new Pessoa("Victor", "389.620.448-38");
        Precedente p2 = new Pessoa("Carlos", "389.620.448-38");
        Precedente p3 = new Pessoa("Ana", "389.620.448-38");

        List<Precedente> pessoas = new ArrayList<Precedente>();

        pessoas.add(p1);
        pessoas.add(p2);
        pessoas.add(p3);

        Precedente<Pessoa>[] resultado = SortUtil.sort(pessoas.toArray(new Precedente[0]));

        Arrays.stream(resultado).forEach(System.out::println);

        Precedente c1 = new Celular(14981934380l, "Victor");
        Precedente c2 = new Celular(55981934380l, "Victor");
        Precedente c3 = new Celular(21981934380l, "Victor");
        Precedente c4 = new Celular(11981934380l, "Victor");

        List<Precedente> celulares = new ArrayList<Precedente>();

        celulares.add(c1);
        celulares.add(c2);
        celulares.add(c3);
        celulares.add(c4);

        Precedente<Celular>[] resultado2 = SortUtil.sort(celulares.toArray(new Precedente[0]));

        Arrays.stream(resultado2).forEach(System.out::println);
    }
}
