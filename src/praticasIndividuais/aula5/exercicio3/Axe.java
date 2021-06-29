package praticasIndividuais.aula5.exercicio3;

public class Axe extends Weapon{

    public Axe(String type, String name) {
        super(type, name);
    }

    @Override
    public void attack() {
        System.out.println("The character hits an enemy with his axe");
    }

    @Override
    public void increasePower() {
        System.out.println("The character has increased his axe's power");
    }
}
