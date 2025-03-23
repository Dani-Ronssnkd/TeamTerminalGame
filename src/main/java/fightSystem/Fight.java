package fightSystem;

import entitySystem.Entity;
import entitySystem.player.Player;

import java.util.Scanner;

public class Fight {
    private final Player player;
    private final Scanner userResponse = new Scanner(System.in);
    public Fight(Player player,Entity enemy){
        this.player=player;
        fightWith(enemy);
    }
    private void fightWith(Entity enemy){
        System.out.println("Tu vida: " + this.player.getHealth());
        System.out.println("Vida de " + enemy.getName() + ": " + enemy.getHealth());

        while (player.getHealth()>0&&enemy.getHealth()>0){
            System.out.println("1 para atacar\n2 para dejar pasar turno");
            switch (userResponse.nextLine().trim()) {
                case "1": attack(enemy);
                break;
                case "2": enemyAttack(enemy);
                break;
                default:
                    System.out.println("Elige una opción válida");
            }
        }
        if (player.getHealth()<=0){
            System.out.println("Has muerto");
        }else {
            System.out.println("Ganaste");
        }
    }
    public void attack(Entity enemy){
        System.out.print("Haces " + player.getStrength() + " de daño -> ");
        enemy.setHealth(enemy.getHealth()-this.player.getStrength());
        System.out.println("Vida de " + enemy.getName() + ": " + enemy.getHealth());
    }
    public void enemyAttack(Entity enemy){
        System.out.print(enemy.getName() + " te hace " + enemy.getStrength() + " de daño -> ");
        player.setHealth(player.getHealth()-enemy.getStrength());
        System.out.println("Vida: " + player.getHealth());
    }
}
