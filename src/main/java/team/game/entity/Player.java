package team.game.entity;

import team.game.contract.util.DirectionType;
import team.game.entity.abstraction.AbstractEntity;
import team.game.entity.items.Item;

public class Player extends AbstractEntity {

    // inventory, every item in inventory will add some bonuses to player, create the mechanism for that
    private final Item[] itemList;

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

    private void moveUp() {
        this.setX(this.getX() - 1);
    }
    private void moveDown() {
        this.setX(this.getX() + 1);
    }
    private void moveLeft() {
        this.setY(this.getY() - 1);
    }
    private void moveRight() {
        this.setY(this.getY() + 1);
    }

    public Item[] getItemList() {
        return itemList;
    }
}
