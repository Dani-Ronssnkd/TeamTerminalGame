package entitySystem;

public class Entity extends EntityCharacteristics{
    private final String name;
    public Entity(String name,int strength, int health, int maxHealth, int defense){
        super(strength,health,maxHealth,defense);
        this.name=name;
    }

    public String getName() {
        return name;
    }
}
