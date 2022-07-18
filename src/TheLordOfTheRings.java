import players.*;

public class TheLordOfTheRings {
    public static void main(String[] args) {
        Introduction();

        Team Heroes = new Team();
        Team Beasts = new Team();

        Heroes.FindPlayer(new Elves("Elv1", 250, 100));
        Heroes.FindPlayer(new Humans("Carlos", 180, 75));
        Heroes.FindPlayer(new Hobbits("Hobbit1", 200, 100));
        Heroes.FindPlayer(new Humans("Pedro", 180, 100));
        Heroes.FindPlayer(new Humans("Juan", 180, 100));

        Beasts.FindPlayer(new Goblins("Goblin2", 325, 100));
        Beasts.FindPlayer(new Orcs("Orc2", 300, 160));
        Beasts.FindPlayer(new Goblins("Goblin1", 325, 1000));
        Beasts.FindPlayer(new Orcs("Orc1", 300, 1500));
        BattleField.Fight(Heroes, Beasts);

    }

    public static void Introduction() {
        System.out.println("Welcome to this play inspired on The Lord of the Rings");
    }


}
