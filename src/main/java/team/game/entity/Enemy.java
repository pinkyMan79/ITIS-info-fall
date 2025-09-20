package team.game.entity;
import team.game.contract.util.DirectionType;
import team.game.entity.parent.AbstractEntity;
import java.util.Random;

public class Enemy extends AbstractEntity {

    private static final Random random = new Random();

    public Enemy(int healthPoint, int damagePoint, int x, int y) {
        super(healthPoint, damagePoint, x, y);
    }
    @Override
    public void move(DirectionType directionType) {
        int randomNum = random.nextInt(4);
        switch (randomNum) {
            case 0: moveUp(); break;
            case 1: moveDown(); break;
            case 2: moveLeft(); break;
            case 3: moveRight(); break;
        }
    }

    public void takeDamage(int damage) {
        int newHp = getHealthPoint() - damage;
        setHealthPoint(Math.max(newHp, 0));
    }


    public static Enemy generateRandomEnemy(int mapSize) {
        int x = random.nextInt(mapSize);
        int y = random.nextInt(mapSize);
        int hp = 5 + random.nextInt(7);
        int damage = 1 + random.nextInt(3);
        return new Enemy(hp, damage, x, y);
    }
}

