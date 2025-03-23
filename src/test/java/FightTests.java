import entitySystem.Entity;
import entitySystem.player.Player;
import fightSystem.Fight;
import org.junit.jupiter.api.Test;

public class FightTests {
    @Test
    public void fight(){
        Entity enemy = new Entity("Ian",10,30,30,4);
        Player feministas = new Player("Alba yubero");
        new Fight(feministas,enemy);
    }
}
