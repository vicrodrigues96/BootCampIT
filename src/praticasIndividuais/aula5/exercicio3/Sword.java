package praticasIndividuais.aula5.exercicio3;

public class Sword extends Weapon{

    public Sword(String type, String name) {
        super(type, name);
    }

    @Override
    public void attack() {
        System.out.println("The character hits an enemy with his sword");
    }

    @Override
    public void increasePower() {
        System.out.println("The character has increased his sword's power");
    }
}
