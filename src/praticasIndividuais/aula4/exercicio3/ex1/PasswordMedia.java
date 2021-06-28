package praticasIndividuais.aula4.exercicio3.ex1;

public class PasswordMedia extends Password{
    @Override
    void validarSenha(String senha) {
        String pattern = "(?=.*[0-9])(?=.*[a-z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}";

        if (!senha.matches(pattern)) {
            throw new RuntimeException("Senha não coincide com o padrao de senha média");
        }
    }
}
