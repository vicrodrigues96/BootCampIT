package praticasIndividuais.aula6.exercicio2;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws Exception {

        Corrida corrida = new Corrida(30000, new BigDecimal(10000), "Interlagos", 10);
        corrida.registrarCarro(120, 10, 15, "fhk333");
        corrida.registrarCarro(1800, 15, 15, "3000222");
        corrida.registrarMoto(150, 15, 15, "222");

        System.out.println("Vencedor da corrida:  " + corrida.vencedorDaCorrida());

        corrida.socorrerCarro("fhk333");
        corrida.getSocorristaCarro().socorrer(corrida.encontrarVeiculoPorPlaca("222"));

        corrida.socorrerCarro("222");
        corrida.getSocorristaCarro().socorrer(corrida.encontrarVeiculoPorPlaca("222"));
    }
}
