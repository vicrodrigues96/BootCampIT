package praticasIndividuais.aula4.exercicio2.ex4;

public class Fracao {
    private int numerador;
    private int denominador;

    public Fracao(int numerador, int denominador) {
        if (denominador == 0) {
            throw new IllegalArgumentException("O denominador não pode ser 0.");
        }
        this.numerador = numerador;
        this.denominador = denominador;
    }

    public void soma (Fracao other) {
        if (this.denominador == other.denominador) {
            this.numerador += other.denominador;
            this.denominador = other.denominador;
        } else {
            this.numerador = (((this.denominador * other.denominador) / this.denominador) * this.numerador) +
                             (((this.denominador * other.denominador) / other.denominador) * other.numerador);
            this.denominador = this.denominador * other.denominador;
        }
    }

    public void subtracao (Fracao other) {
        if (this.denominador == other.denominador) {
            this.numerador -= other.denominador;
            this.denominador = other.denominador;
        } else {
            this.numerador = (((this.denominador * other.denominador) / this.denominador) * this.numerador) -
                    (((this.denominador * other.denominador) / other.denominador) * other.numerador);
            this.denominador = this.denominador * other.denominador;
        }
    }

    public void divisao(Fracao other) {
        this.numerador = this.numerador * other.denominador;
        this.denominador = this.denominador * other.numerador;
    }

    public void multiplicacao(Fracao other) {
        this.numerador = this.numerador * other.numerador;
        this.denominador = this.denominador * other.denominador;
    }

    @Override
    public String toString() {
        return this.numerador + "/" + this.denominador;
    }
}
