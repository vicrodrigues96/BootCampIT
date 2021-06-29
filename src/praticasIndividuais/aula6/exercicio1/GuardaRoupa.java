package praticasIndividuais.aula6.exercicio1;

import java.util.List;

public class GuardaRoupa {

    private String dicionario;
    private int identificador;

    public String getDicionario() {
        return dicionario;
    }

    public void setDicionario(String dicionario) {
        this.dicionario = dicionario;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public Integer guardarVestuarios(List<Vestuario> listaDeVestuario) {

        int codigo = this.identificador;

        for (int i = 0; i < listaDeVestuario.size(); i++) {
            listaDeVestuario.set(this.identificador, listaDeVestuario.get(i));
        }
        this.identificador++;
        return codigo;
    }
}
