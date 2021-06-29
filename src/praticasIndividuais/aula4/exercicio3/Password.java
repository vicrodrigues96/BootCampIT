package praticasIndividuais.aula4.exercicio3;

public  abstract class Password {
    private String pattern;
    private String tipoSenha;

    public Password(String pattern, String tipoSenha) {
        this.pattern = pattern;
        this.tipoSenha = tipoSenha;
    }

    public String getPattern() {
        return pattern;
    }

    public void validarSenha(String senha) {
        if (!senha.matches(this.pattern)) {
            throw new RuntimeException("Senha não atende os requisitos necessários para a senha "+this.tipoSenha);
        }
    }
}
