package praticasIndividuais.aula5.exercicio3;

public abstract class Weapon implements Comparable<Weapon>{
    private String type;
    private String name;

    public Weapon(String type, String name) {
        this.type = type;
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void attack();
    public abstract void increasePower();

    @Override
    public int compareTo(Weapon w) {
        return this.getName().compareTo(w.getName());
    }

    @Override
    public String toString() {
        return this.name;
    }
}
