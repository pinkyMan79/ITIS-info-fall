package team.game.entity;

import team.game.contract.util.DirectionType;
import team.game.entity.parent.AbstractEntity;
import team.game.entity.items.Item;

public class Player extends AbstractEntity {

    // inventory, every item in inventory will add some bonuses to player, create the mechanism for that
    private final Item[] itemList;
    // bonus=0
    public Player(int healthPoint, int damagePoint, int x, int y) {
        super(healthPoint, damagePoint, x, y);
        this.itemList = new Item[100];
    }

    @Override
    public void move(DirectionType directionType) {
        switch (directionType) {
            case UP -> moveUp();
            case DOWN -> moveDown();
            case LEFT -> moveLeft();
            case RIGHT -> moveRight();
            default -> System.out.println("incompatible command");
        }
    }

    public Item[] getItemList() {
        return itemList;
    }
}
