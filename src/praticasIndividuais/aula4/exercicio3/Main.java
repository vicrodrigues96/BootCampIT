package praticasIndividuais.aula4.exercicio3.ex1;

public class Main {

    public static void main(String[] args) {

        String senha = "senha@baa1";

        PasswordMedia validaSenhaMedia = new PasswordMedia();
        validaSenhaMedia.validarSenha(senha);

        PasswordFraca validarSenhaFraca = new PasswordFraca();
        validarSenhaFraca.validarSenha(senha);

        PasswordForte validarSenhaForte = new PasswordForte();
        validarSenhaForte.validarSenha(senha);
    }
}
