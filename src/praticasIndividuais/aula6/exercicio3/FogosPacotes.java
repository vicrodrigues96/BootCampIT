package praticasIndividuais.aula6.exercicio3;

import java.util.ArrayList;
import java.util.List;

public class FogosPacotes implements FogosDeArtificio{

    private List<FogosDeArtificio> listaFogos;

    public FogosPacotes() {
        this.listaFogos = new ArrayList<FogosDeArtificio>();
    }

    @Override
    public void dispararFogos() {
        System.out.println("Disparando pacotes");
        this.listaFogos.forEach(f -> f.dispararFogos());
    }

    public void addFogos(FogosDeArtificio fogos) {
        listaFogos.add(fogos);
    }
}
