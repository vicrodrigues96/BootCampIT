package praticasIndividuais.aula4.exercicio3;

public class Main {

    public static void main(String[] args) {

        String senha = "Victorteste55";

        PasswordForte validarSenhaForte = new PasswordForte();
        validarSenhaForte.validarSenha(senha);

        PasswordMedia validaSenhaMedia = new PasswordMedia();
        validaSenhaMedia.validarSenha(senha);

        PasswordFraca validarSenhaFraca = new PasswordFraca();
        validarSenhaFraca.validarSenha(senha);
    }
}
