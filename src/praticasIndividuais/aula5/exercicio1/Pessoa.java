package praticasIndividuais.aula5.exercicio1;

import java.util.Locale;

public class Pessoa implements Precedente<Pessoa> {

    private String nome;
    private String cpf;

    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    @Override
    public int precedeA(Pessoa pessoa) {
        return this.nome.toLowerCase().compareTo(pessoa.getNome().toLowerCase());
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                '}';
    }
}
