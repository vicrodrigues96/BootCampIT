package praticasIndividuais.aula6.exercicio3;
public class FogosIndividuais implements FogosDeArtificio{

    private String nome;

    public FogosIndividuais(String nome) {
        this.nome = nome;
    }

    @Override
    public void dispararFogos() {

        int length =  10;
        System.out.println("Disparando fogos individuais: " + getRandomString(length));
    }

    public String getRandomString(int i)
    {
        String theAlphaNumericS;
        StringBuilder builder;

        theAlphaNumericS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        //create the StringBuffer
        builder = new StringBuilder(i);

        for (int m = 0; m < i; m++) {

            // generate numeric
            int myindex
                    = (int)(theAlphaNumericS.length()
                    * Math.random());

            // add the characters
            builder.append(theAlphaNumericS
                    .charAt(myindex));
        }

        return builder.toString();
    }

    @Override
    public String toString() {
        return "FogosIndividuais{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
