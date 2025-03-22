package entitySystem;

public class EntityCharacteristics {
    protected int strength;
    protected int health;
    protected int maxHealth;
    protected int defense;
    public EntityCharacteristics(int strength,int health,int maxHealth, int defense){
        this.strength=strength;
        this.health=health;
        this.maxHealth=maxHealth;
        this.defense=defense;
    }

    public int getStrength() {
        return strength;
    }

    public int getHealth() {
        return health;
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public int getDefense() {
        return defense;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public void setHealth(int health) {
        this.health = Math.min(maxHealth,health);
    }

    public void setMaxHealth(int maxHealth) {
        this.maxHealth = maxHealth;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }
}
