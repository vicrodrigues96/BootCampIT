package praticasIndividuais.aula5.exercicio3;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Sword sword = new Sword("Physical", "Firesword");
        Axe axe = new Axe("Physical", "Stonecutter Axe");
        Crossbow crossbow = new Crossbow("Distance", "Royal Crossbow");

        Character character = new Character("Sniper expert", "Paladin", 300, crossbow);

        character.getWeapon().attack();
        character.getWeapon().increasePower();
        character.setWeapon(axe);
        character.getWeapon().attack();
        character.getWeapon().increasePower();
        character.setWeapon(sword);
        character.getWeapon().attack();
        character.getWeapon().increasePower();

        List<Weapon> weapons = new ArrayList<Weapon>();
        weapons.add(crossbow);
        weapons.add(axe);
        weapons.add(sword);

        weapons.sort(null);

        weapons.forEach(System.out::println);
    }
}
