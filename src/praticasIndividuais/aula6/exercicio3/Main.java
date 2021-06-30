package praticasIndividuais.aula6.exercicio3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List convidados = new ArrayList<Convidado>();

        convidados.add(new Convidado(TipoConvidado.MELI, "Victor Rodrigues", 24));
        convidados.add(new Convidado(TipoConvidado.STANDARD, "Carlos Alberto", 24));
        convidados.add(new Convidado(TipoConvidado.STANDARD, "Ana Julia", 24));
        convidados.add(new Convidado(TipoConvidado.MELI, "Carla", 24));

        FogosIndividuais fogoIndividual1 = new FogosIndividuais("Individual 1");
        FogosIndividuais fogoIndividual2 = new FogosIndividuais("Individual 2");
        FogosIndividuais fogoIndividual3 = new FogosIndividuais("Individual 3");

        List pacoteFogos1 = new ArrayList<FogosPacotes>();
        pacoteFogos1.add(fogoIndividual1);
        pacoteFogos1.add(fogoIndividual2);
        pacoteFogos1.add(fogoIndividual3);

//        List listaFogos = new ArrayList<FogosDeArtificio>();
//
//        listaFogos.add(fogoIndividual1);
//        listaFogos.addAll(pacoteFogos1);

        Evento evento = new Evento(convidados, pacoteFogos1);

        System.out.println(evento.fogosDeArtificios);
        evento.apagarVelas();
    }
}
