package praticasIndividuais.aula6.exercicio1;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GuardaRoupa {

    public GuardaRoupa() {
        Map<Integer, List<Vestuario>> map = new HashMap<Integer, List<Vestuario>>();
        this.dicionario = map;
    }

    private Map dicionario;
    private int identificador;

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public Integer guardarVestuarios(List<Vestuario> listaDeVestuario) {

        int codigo = this.identificador++;
        this.dicionario.put(codigo, listaDeVestuario);
        return codigo;
    }

    public void mostrarVestuarios() {
        this.dicionario.entrySet().forEach(entry -> {
            System.out.println(entry);
        });
    }

    public List<Vestuario> devolverVestuarios(Integer id) {
        return (List<Vestuario>) this.dicionario.remove(id);
    }
}
