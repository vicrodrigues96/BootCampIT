package praticasIndividuais.aula4.exercicio4;

import java.util.Date;

class PJ extends Funcionario {

    private String cnpj;

    public PJ(Funcionario funcionario, String cnpj) {
        super(funcionario.getSexo(),
                funcionario.getJornada(),
                funcionario.getRemuneracao(),
                funcionario.getNome(),
                funcionario.getNascimento());
        this.cnpj = cnpj;
    }
}