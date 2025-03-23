package entitySystem.player;

import entitySystem.EntityCharacteristics;
import locationSystem.Location;
import locationSystem.Position;

import java.util.Scanner;

public class Player extends EntityCharacteristics {

    private final String name;
    private Position position;
    private Location actualLocation;

    public Player(String name){
        super(5,20,20,0);
        this.name=name;
        position = new Position(0,7);
        actualLocation = new Location(1,"Home","src/main/resources/HomeMap.txt");
    }

    public Location getActualLocation() {
        return actualLocation;
    }

    public Position getPosition() {
        return position;
    }

    public String getName() {
        return name;
    }

    public void moveInMap(){
        Scanner move = new Scanner(System.in);
        String input;
        while (true) {
            int x = position.getX();
            int y = position.getY();
            input = move.nextLine();
            switch (input.trim()) {
                case "w":
                    move(new Position(x - 1, y));
                    break;
                case "a":
                    move(new Position(x, y - 1));
                    break;
                case "s":
                    move(new Position(x + 1, y));
                    break;
                case "d":
                    move(new Position(x, y + 1));
                    break;
                default:
            }
        }
    }
    public void move(Position position){
        char [][] map = actualLocation.getMap();
        if (map == null) {
            System.out.println("Mapa nulo");
            return;
        }
        if (position.getX()<map.length && position.getX()>=0 &&
                position.getY()<map[0].length && position.getY()>=0){
            if (map[position.getX()][position.getY()]==' '){
                this.position=position;
            }
        }
        System.out.println(actualLocation.mapToString(this.position));
    }
}
