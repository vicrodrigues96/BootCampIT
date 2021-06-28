package praticasIndividuais.aula4.exercicio2.ex5;

import java.util.Calendar;
import java.util.Date;

public class Data {

    private Date data;

    public Data() {
        this.data = Calendar.getInstance().getTime();
    }

    public void addDay() {
        Calendar c = Calendar.getInstance();
        c.setTime(this.data);
        c.add(Calendar.DATE, 1);
        this.data = c.getTime();
    }

    @Override
    public String toString() {
        return "Data e Hora Atual: " + data;
    }
}
