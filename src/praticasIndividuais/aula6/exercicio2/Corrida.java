package praticasIndividuais.aula6.exercicio2;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Corrida {

    private int distancia;
    private BigDecimal premioEmDolares;
    private String nome;
    private int quantidadeVeiculosPermitidos;
    private List<Veiculo> listaVeiculos;
    private Veiculo vencedor;
    private SocorristaCarro socorristaCarro;
    private SocorristaMoto socorristaMoto;

    public Corrida(int distancia, BigDecimal premioEmDolares, String nome, int quantidadeVeiculosPermitidos) {
        this.distancia = distancia;
        this.premioEmDolares = premioEmDolares;
        this.nome = nome;
        this.quantidadeVeiculosPermitidos = quantidadeVeiculosPermitidos;
        this.listaVeiculos = new ArrayList<Veiculo>();
        this.socorristaCarro = new SocorristaCarro("191");
        this.socorristaMoto = new SocorristaMoto("191");
    }

    public int getDistancia() {
        return distancia;
    }

    public BigDecimal getPremioEmDolares() {
        return premioEmDolares;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidadeVeiculosPermitidos() {
        return quantidadeVeiculosPermitidos;
    }

    public List<Veiculo> getListaVeiculos() {
        return listaVeiculos;
    }

    public void setListaVeiculos(List<Veiculo> listaVeiculos) {
        this.listaVeiculos = listaVeiculos;
    }

    public Veiculo getVencedor() {
        return vencedor;
    }

    public void setVencedor(Veiculo vencedor) {
        this.vencedor = vencedor;
    }

    public SocorristaCarro getSocorristaCarro() {
        return socorristaCarro;
    }

    public void setSocorristaCarro(SocorristaCarro socorristaCarro) {
        this.socorristaCarro = socorristaCarro;
    }

    public SocorristaMoto getSocorristaMoto() {
        return socorristaMoto;
    }

    public void setSocorristaMoto(SocorristaMoto socorristaMoto) {
        this.socorristaMoto = socorristaMoto;
    }

    public void registrarCarro(int velocidade, int aceleracao, int anguloDeGiro, String placa) throws Exception {
        checaDisponibilidadeInserirVeiculo(placa);
        this.listaVeiculos.add(new Carro(velocidade, aceleracao, anguloDeGiro, placa));
    }

    public void registrarMoto(int velocidade, int aceleracao, int anguloDeGiro, String placa) throws Exception {
        checaDisponibilidadeInserirVeiculo(placa);
        this.listaVeiculos.add(new Moto(velocidade, aceleracao, anguloDeGiro, placa));
    }

    public void checaDisponibilidadeInserirVeiculo(String placa) throws Exception {
        if(encontrarVeiculoPorPlaca(placa) != null) {
            throw new Exception("Já existe um veículo com este numero de placa");
        }

        if(this.listaVeiculos.size() >= this.quantidadeVeiculosPermitidos) {
            throw new Exception("Não será possível adicionar um veículo, " +
                    "a quantidade máxima de veiculos permitidos já foi atingida");
        }
    }

    public void removerVeiculo(Veiculo veiculo) {
        this.listaVeiculos.remove(veiculo);
    }

    public void removerVeiculoPorPlaca(String placa) {
        this.listaVeiculos.removeIf(v -> v.getPlaca() == placa);
    }

    public Veiculo vencedorDaCorrida() {
        this.listaVeiculos.forEach(e -> {
            Veiculo liderAtual = this.vencedor;
            if (liderAtual == null) {
                liderAtual = e;
            } else if (e.desempenhoCorrida() > liderAtual.desempenhoCorrida()){
                liderAtual = e;
            }
            this.vencedor = liderAtual;
        });
        return this.vencedor;
    }

    public void socorrerCarro(String placa) {
        System.out.println("Ajudar o carro " + placa);
    }

    public void socorrerMotocicleta(String placa) {
        System.out.println("Ajudar a motocicleta " + placa);
    }

    public Veiculo encontrarVeiculoPorPlaca(String placa) {
        Veiculo veiculo = this.listaVeiculos.stream().filter(v -> v.getPlaca() == placa)
                .findAny()
                .orElse(null);

        return veiculo;
    }
}
