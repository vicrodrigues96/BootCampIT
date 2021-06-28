package praticasIndividuais.aula4.exercicio3.ex1;

import java.util.regex.PatternSyntaxException;

public class PasswordFraca extends Password {

    @Override
    void validarSenha(String senha) {
        String pattern = "(?=.*[a-z])";

        if (!senha.matches(pattern)) {
            throw new RuntimeException("Senha não coincide com o padrao de senha fraca");
        }
    }
}
