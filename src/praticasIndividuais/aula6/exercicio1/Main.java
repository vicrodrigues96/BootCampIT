package praticasIndividuais.aula6.exercicio1;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        GuardaRoupa guardaRoupa = new GuardaRoupa();

        List<Vestuario> roupasVictor = new ArrayList<Vestuario>();
        Vestuario camisetaVictor = new Vestuario("Nike", "Camisa");
        Vestuario bermudaVictor = new Vestuario("Nike", "Bermuda");
        roupasVictor.add(camisetaVictor);
        roupasVictor.add(bermudaVictor);

        List<Vestuario> roupasAna = new ArrayList<Vestuario>();

        Vestuario vestidoAna = new Vestuario("Ellus", "Vestido");
        Vestuario calcaAna = new Vestuario("Ellus", "Calça");
        roupasAna.add(vestidoAna);
        roupasAna.add(calcaAna);

        guardaRoupa.guardarVestuarios(roupasVictor);
        guardaRoupa.guardarVestuarios(roupasAna);

        guardaRoupa.mostrarVestuarios();
        System.out.println("Removido:®");
        System.out.println(guardaRoupa.devolverVestuarios(0));
        guardaRoupa.mostrarVestuarios();
    }
}
