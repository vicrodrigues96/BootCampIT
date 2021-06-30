package praticasIndividuais.aula6.exercicio3;

public class Convidado {

    private TipoConvidado tipo;
    private String nome;
    private int idade;

    public Convidado(TipoConvidado tipo, String nome, int idade) {
        this.tipo = tipo;
        this.nome = nome;
        this.idade = idade;
    }

    public TipoConvidado getTipo() {
        return tipo;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }
}
