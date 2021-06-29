package praticasIndividuais.aula6.exercicio2;

public class SocorristaMoto extends  Veiculo{

    public SocorristaMoto(String placa) {
        super(placa);
    }

    public void socorrer(Veiculo moto) {
        System.out.println("Socorrendo a moto: " + moto);
    }
}
