package players;

public class Heroes extends Player {

    public int dice1 = 0;
    public int dice2 = 0;

    public Heroes(String Name, int LifePoints, int ReinforcementArmor) {
        super(Name, LifePoints, ReinforcementArmor);
    }

    @Override
    public void Attack(Player Against) {
        dice1 = (int) (Math.random() * (100 + 1));
        dice2 = (int) (Math.random() * (100 + 1));
        System.out.println("First Dice: " + dice1);
        System.out.println("Second dice: " + dice2);

        int Top = Math.max(dice1, dice2);
        Against.Attacked(Top);
    }

    public String toString() {
        return getName() + " (Life=" + getLifePoints() + " Armor=" + getReinforcementArmor() + ")";
    }
}
