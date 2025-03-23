import entitySystem.player.Player;
import locationSystem.Location;
import org.junit.jupiter.api.Test;
public class LocationTests {
    @Test
    public void showMapEnsure(){
        Player player = new Player("Dani");
        Location home = new Location(1,"Home","src/main/resources/HomeMap.txt");
        System.out.println(home.mapToString(player.getPosition()));
    }
}
