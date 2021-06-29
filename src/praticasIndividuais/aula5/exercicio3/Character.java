package praticasIndividuais.aula5.exercicio3;

public class Character {

    private String name;
    private String clazz;
    private int level;
    private Weapon weapon;

    public Character(String name, String clazz, int level, Weapon weapon) {
        this.name = name;
        this.clazz = clazz;
        this.level = level;
        this.weapon = weapon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClazz() {
        return clazz;
    }

    public void setClazz(String clazz) {
        this.clazz = clazz;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
}
