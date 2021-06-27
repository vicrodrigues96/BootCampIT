package praticasIndividuais.aula4.exercicio2.ex2;

public class Counter {

    public Counter() {

    }

    public Counter(int actualNumber) {
        this.actualNumber = actualNumber;
    }

    public Counter(Counter counter) {
        this.actualNumber = counter.getActualNumber();
    }

    private int actualNumber;

    public int getActualNumber() {
        return actualNumber;
    }

    public void setActualNumber(int actualNumber) {
        this.actualNumber = actualNumber;
    }

    public void add() {
        this.actualNumber += 1;
    }

    public void subtract() {
        this.actualNumber -= 1;
    }

    @Override
    public String toString() {
        return "Counter actual state: " + this.actualNumber;
    }
}
