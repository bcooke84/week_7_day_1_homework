package kaiju;

public abstract class Kaiju {
    protected String name;
    protected int healthValue;
    protected int attackValue;

    public Kaiju(String name, int healthValue, int attackValue) {
        this.name = name;
        this.healthValue = healthValue;
        this.attackValue = attackValue;
    }

    public String roar() {
        return "ROAR!";
    }

    public String receiveDamage(int damage) {
        this.healthValue = this.healthValue - damage;
        if (this.healthValue > 0) {
        return this.name + " has taken damage, health is now " + this.healthValue + "!"; }
        else return this.name + " is dead!";
    }


}
