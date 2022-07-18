import players.Heroes;
import players.Beasts;
import java.util.Scanner;

public class BattleField {

    private static Scanner scanner = new Scanner(System.in);

    public static void Fight(Team Heroes, Team Beasts) {
        while (!Heroes.PlayerLoses() && !Beasts.PlayerLoses()) {
            int TotalTurns;
            if (Heroes.ActivePlayers.size() >= Beasts.ActivePlayers.size()) {
                TotalTurns = Heroes.ActivePlayers.size();
            } else {
                TotalTurns = Beasts.ActivePlayers.size();
            }
            for (int turn = 0; turn < TotalTurns; turn++) {
                Heroes hero = (Heroes) Heroes.getPlayer(turn);
                Beasts beast = (Beasts) Beasts.getPlayer(turn);
                if (hero == null && beast == null) {
                    System.out.println("Round Finished");
                    break;
                } else if (hero == null) {
                    System.out.println("There is not a hero, " + beast.getName() + " still alive");
                } else if (beast == null) {
                    System.out.println("There is not a beast, " + hero.getName() + " still alive");
                } else {
                    //War starts
                    System.out.println("Round between, " + hero + " and " + beast);
                    //Hero turn
                    System.out.println("Turn of: " + hero.getName());
                    //int HeroAttack = hero.Attack();
                    hero.Attack(beast);
                    System.out.println("Information of  " + beast.getName() + ": " + beast);
                    if (beast.isDead()) {
                        System.out.println(beast.getName() + " was killed");
                    } else {
                        //Beast Turn
                        System.out.println("Turn of: " + beast.getName());
                        //int BeastAttack = beast.Attack();
                        beast.Attack(hero);
                        System.out.println("Information of  " + hero.getName() + ": " + hero);
                        if (hero.isDead())
                            System.out.println(hero.getName() + " was killed");
                    }
                }
                //Turn finished, now check the teams
                Heroes.CheckTeam();
                Beasts.CheckTeam();
                ContinueUser();  //Next Round
            }
        }
        //Someone lost
        if (Heroes.PlayerLoses())
            System.out.println("Beasts has won. Beast who still alive: " + Beasts.ActivePlayers.size());
        else
            System.out.println("Heroes has won. Heroes who still alive: " + Heroes.ActivePlayers.size());
    }

    private static void ContinueUser() {
        System.out.println("\n\t\tPlease use Intro to continue...\n");
        scanner.nextLine();
    }
}
