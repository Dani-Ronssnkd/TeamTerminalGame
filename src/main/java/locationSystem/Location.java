package locationSystem;

import java.io.*;
import java.util.Scanner;

public class Location {
    private final int id;
    private String name;
    private final char[][] map;

    public Location(int id, String name, String route){
        this.id = id;
        this.name = name;
        this.map=reconstructMap(route);
    }
    public Location(int id, String name){
        this.id = id;
        this.name = name;
        this.map = randomMap();
    }
    private char[][] reconstructMap(String route){
        try (Scanner scanner = new Scanner(new File(route))){
            char[][] readenMap = new char[scanner.nextInt()][scanner.nextInt()];
            scanner.nextLine();
            int index = 0;
            while (scanner.hasNext()){
                char[] linea = scanner.nextLine().toCharArray();
                System.arraycopy(linea,0,readenMap[index],0,linea.length);
                ++index;
            }
            return readenMap;
        } catch (FileNotFoundException e) {
            throw new RuntimeException("No se pudo acceder al mapa en " + route);
        } catch (Exception e) {
            throw new RuntimeException("Error al leer el mapa: " + e);
        }
    }


    public String getName() {
        return name;
    }

    public char[][] getMap() {
        return map;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }


    public char[][] randomMap() { //method to create a random map
        return null;
    }

    public String mapToString (Position playerPosition){
        if (map==null) return "Mapa nulo";
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[0].length; j++) {
                 builder.append(playerPosition.x == i && playerPosition.y == j ? 'P' : map[i][j]);
            }
            builder.append('\n');
        }
        return builder.toString();
    }
}
