package praticasIndividuais.aula5.exercicio3;

public class Crossbow extends Weapon{

    public Crossbow(String type, String name) {
        super(type, name);
    }

    @Override
    public void attack() {
        System.out.println("An arrow has been shooted by the character");
    }

    @Override
    public void increasePower() {
        System.out.println("The character has increased his xbow's power");
    }
}
