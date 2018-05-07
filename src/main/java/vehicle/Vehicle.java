package vehicle;

import kaiju.Kaiju;

public class Vehicle {
    private String type;
    private int healthValue;

    public Vehicle(String type, int healthValue) {
        this.type = type;
        this.healthValue = healthValue;
    }

    public String getType() {
        return type;
    }

    public int getHealthValue() {
        return healthValue;
    }

    public String missileAttack(Kaiju kaiju) {
        int damage = 10;
        kaiju.receiveDamage(damage);
        return "Direct hit!";
    }

    public String gunAttack(Kaiju kaiju) {
        int damage = 5;
        kaiju.receiveDamage(damage);
        return "Ready, aim, fire!";
    }

    public String receiveDamage(int damage) {
        this.healthValue = this.healthValue - damage;
        if (this.healthValue > 0) {
        return this.type+ " has taken damage, health is now " + this.healthValue + "!";}
        else return this.type + " has been destroyed!";
    }




}
