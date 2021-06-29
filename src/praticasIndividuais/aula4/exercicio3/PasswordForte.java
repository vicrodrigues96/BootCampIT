package praticasIndividuais.aula4.exercicio3;

public class PasswordForte extends Password{

    public PasswordForte() {
        super("(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}", "Forte");
    }

}
