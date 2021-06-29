package praticasIndividuais.aula6.exercicio2;

public abstract class Veiculo {

    private int velocidade;
    private int aceleracao;
    private int anguloDeGiro;
    private String placa;
    private int peso;
    private int rodas;

    public Veiculo(int velocidade, int aceleracao, int anguloDeGiro, String placa, int peso, int rodas) {
        this.velocidade = velocidade;
        this.aceleracao = aceleracao;
        this.anguloDeGiro = anguloDeGiro;
        this.placa = placa;
        this.peso = peso;
        this.rodas = rodas;
    }

    public Veiculo(String placa) {

    }

    public int getVelocidade() {
        return velocidade;
    }

    public int getAceleracao() {
        return aceleracao;
    }

    public int getAnguloDeGiro() {
        return anguloDeGiro;
    }

    public String getPlaca() {
        return placa;
    }

    public int getPeso() {
        return peso;
    }

    public int getRodas() {
        return rodas;
    }

    public int desempenhoCorrida() {
        return velocidade *  aceleracao / ( anguloDeGiro * (peso - rodas * 100));
    }

    @Override
    public String toString() {
        return "Veiculo{" +
                "velocidade=" + velocidade +
                ", aceleracao=" + aceleracao +
                ", anguloDeGiro=" + anguloDeGiro +
                ", placa='" + placa + '\'' +
                ", peso=" + peso +
                ", rodas=" + rodas +
                '}';
    }
}
