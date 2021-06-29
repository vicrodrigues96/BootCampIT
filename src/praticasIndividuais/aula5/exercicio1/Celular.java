package praticasIndividuais.aula5.exercicio1;

public class Celular implements Precedente<Celular> {

    private Long number;
    private String holder;

    public Celular(Long number, String holder) {
        this.number = number;
        this.holder = holder;
    }

    public Long getNumber() {
        return number;
    }

    public String getHolder() {
        return holder;
    }

    @Override
    public int precedeA(Celular celular) {
        return Long.compare(this.number, celular.getNumber());
    }

    @Override
    public String toString() {
        return "number=" + number;
    }
}
