package praticasIndividuais.aula6.exercicio3;

import java.util.List;

public class Evento {

    List<Convidado> convidados;
    List<FogosDeArtificio> fogosDeArtificios;

    public Evento(List<Convidado> convidados, List<FogosDeArtificio> fogosDeArtificios) {
        this.convidados = convidados;
        this.fogosDeArtificios = fogosDeArtificios;
    }

    public void apagarVelas() {
        distribuirBolo();
        this.fogosDeArtificios.forEach(f -> {
            f.dispararFogos();
        });
    }

    private void distribuirBolo() {
        this.convidados.forEach(c -> {
            if (c.getTipo() == TipoConvidado.MELI) {
                System.out.println(c.getNome() + " - Viva la Chiqui");
            }
        });
    }

    @Override
    public String toString() {
        return "Evento{" +
                "convidados=" + convidados +
                ", fogosDeArtificios=" + fogosDeArtificios +
                '}';
    }
}
