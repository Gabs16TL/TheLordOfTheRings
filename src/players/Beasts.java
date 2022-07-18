package players;

import java.util.Random;

public class Beasts extends Player {

    public Beasts(String Name, int LifePoints, int ReinforcementArmor) {
        super(Name, LifePoints, ReinforcementArmor);
    }

    @Override
    public int getReinforcementArmor() {
        return super.getReinforcementArmor();
    }

    @Override
    public void Attack(Player Against) {
        Random dice = new Random();
        int RollTheDice = dice.nextInt(91);
        System.out.println("The result is: " + RollTheDice);
        Against.Attacked(RollTheDice);
    }

    public String toString() {
        return getName() + " (Life=" + getLifePoints() + " Armor=" + getReinforcementArmor() + ")";
    }
}

