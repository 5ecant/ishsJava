public abstract class Poketmon {
    protected String name;
    private int hp;

    public Poketmon(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }

    public String getName() {
        return name;
    }

    public int getHP() {
        return hp;
    }

    public abstract void attack(Poketmon target);
}