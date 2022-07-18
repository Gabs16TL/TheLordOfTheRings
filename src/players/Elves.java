package players;

public class Elves extends Heroes {


    public Elves(String Name, int LifePoints, int ReinforcementArmor) {
        super(Name, LifePoints, ReinforcementArmor);
    }

    @Override
    public void Attack(Player Against) {
        if (Against instanceof Orcs) {
            dice1 = (int) (Math.random() * (100 + 1));
            dice2 = (int) (Math.random() * (100 + 1));

            System.out.println("First Dice: " + dice1);
            System.out.println("Second dice: " + dice2);

            int Top = Math.max(dice1, dice2);
            System.out.println("*****1.5x extra *****");
            Top *= 1.5;
            System.out.println("Attack: " + Top);
            Against.Attacked(Top);

        } else
            super.Attack(Against);
    }
}
