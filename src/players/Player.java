package players;

public abstract class Player {
    String Name;
    public int LifePoints;
    int ReinforcementArmor;

    public Player(String Name, int LifePoints, int ReinforcementArmor) {
        this.Name = Name;
        this.LifePoints = LifePoints;
        this.ReinforcementArmor = ReinforcementArmor;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public int getLifePoints() {
        return LifePoints;
    }

    public void setLifePoints(int lifePoints) {
        LifePoints = lifePoints;
    }

    public int getReinforcementArmor() {
        return ReinforcementArmor;
    }

    public void setReinforcementArmor(int reinforcementArmor) {
        ReinforcementArmor = reinforcementArmor;
    }

    public abstract void Attack(Player Against);

    public boolean isDead() {
        return LifePoints <= 0;
    }

    public void Attacked(int attack) {
        if (attack > ReinforcementArmor)
            LifePoints -= attack - ReinforcementArmor;

        if (LifePoints < 0)
            LifePoints = 0; //Avoid negative points
    }

    @Override
    public String toString() {
        return String.format("%s (Life=%d Armor=%d)", Name, LifePoints, ReinforcementArmor);
    }

}

