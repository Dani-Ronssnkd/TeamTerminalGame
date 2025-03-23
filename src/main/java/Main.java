import entitySystem.Entity;
import entitySystem.player.Player;
import fightSystem.Fight;
import locationSystem.Location;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Entity enemy = new Entity("en",10,30,30,4);
        Player player = new Player("P");
        new Fight(player,enemy);
    }
}
