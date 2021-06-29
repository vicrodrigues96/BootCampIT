package praticasIndividuais.aula6.exercicio2;

public class SocorristaCarro extends Veiculo {

    public SocorristaCarro(String placa) {
        super(placa);
    }

    public void socorrer(Veiculo carro) {
        System.out.println("Socorrendo o carro: " + carro);
    }
}
