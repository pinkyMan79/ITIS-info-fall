package team.game;

import team.game.contract.util.DirectionType;
import team.game.entity.Map;
import team.game.entity.Player;

import java.util.Scanner;

public class GameInit {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Player player = new Player(10, 2, 0, 0);
        Map map = new Map(40);
        map.getEntityList()[0] = player;
        map.render();
        int gameStage = 0; // use for generation enemies, altars, traps and so on
        while(true) {
            gameStage++;
            String command = sc.nextLine();
            // for movements use u -> up, d -> down, l -> left, r -> right
            switch (command) {
                case "u" -> player.move(DirectionType.UP);
                case "d" -> player.move(DirectionType.DOWN);
                case "l" -> player.move(DirectionType.LEFT);
                case "r" -> player.move(DirectionType.RIGHT);
                // add new cases for new mechanisms
                default -> System.out.println("Invalid command");
            }
            map.render();
        }
    }
}