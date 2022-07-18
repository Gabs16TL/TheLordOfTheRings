import players.Player;

import java.util.ArrayList;

public class Team {
    public ArrayList<Player> ActivePlayers;

    public Team() {
        ActivePlayers = new ArrayList<Player>();
    }

    public void FindPlayer(Player player) {
        ActivePlayers.add(player);
    }

    public Player getPlayer(int position) {
        try {
            return ActivePlayers.get(position);
        } catch (Exception e) {
            return null;
        }
    }

    public void CheckTeam() {
        int DeadPlayer = -1;
        for (int position = 0; position < ActivePlayers.size(); position++) {
            if (ActivePlayers.get(position).isDead())
                DeadPlayer = position;
        }
        if (DeadPlayer != -1) {
            ActivePlayers.remove(DeadPlayer);
        }
    }

    public boolean PlayerLoses() {
        return ActivePlayers.size() == 0;
    }
}
