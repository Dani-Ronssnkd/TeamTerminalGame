import entitySystem.Entity;
import entitySystem.player.Player;
import fightSystem.Fight;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Entity slime = new Entity("Slime",3,10,10,1);
        Player player = new Player("dani");
        new Fight(player,slime);
    }
}
