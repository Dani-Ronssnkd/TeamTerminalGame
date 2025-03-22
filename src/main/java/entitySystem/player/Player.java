package entitySystem.player;

import entitySystem.EntityCharacteristics;

public class Player extends EntityCharacteristics {

    private final String name;

    public Player(String name){
        super(5,20,20,0);
        this.name=name;
    }

    public String getName() {
        return name;
    }

}
