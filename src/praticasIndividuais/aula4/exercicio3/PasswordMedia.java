package praticasIndividuais.aula4.exercicio3;

public class PasswordMedia extends Password{

    public PasswordMedia() {
        super("((?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.{6,}))", "Media");
    }
}
