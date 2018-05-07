package kaiju;

import vehicle.Vehicle;

import java.util.Random;

public class AirBased extends Kaiju implements Actions {

    public AirBased(String name, int healthValue, int attackValue) {
        super(name, healthValue, attackValue);
    }

    public String getName() {
        return this.name;
    }

    public int getHealthValue() {
        return this.healthValue;
    }

    public int getAttackValue() {
        return this.attackValue;
    }

    public String fly() {
        return "I am flying";
    }

    public String attack(Vehicle vehicle) {
        Random rand = new Random();
        int damage = rand.nextInt(this.attackValue);
        return damage + " damage inflicted by " + this.name;
    }


}
