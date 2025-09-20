package team.game.entity.parent;

import team.game.contract.Move;

public abstract class AbstractEntity implements Move {

    private int healthPoint;
    private int damagePoint;
    private int x;
    private int y;

    public AbstractEntity(int healthPoint, int damagePoint, int x, int y) {
        this.healthPoint = healthPoint;
        this.damagePoint = damagePoint;
        this.x = x;
        this.y = y;
    }

    public int getHealthPoint() {
        return healthPoint;
    }

    public void setHealthPoint(int healthPoint) {
        this.healthPoint = healthPoint;
    }

    public int getDamagePoint() {
        return damagePoint;
    }

    public void setDamagePoint(int damagePoint) {
        this.damagePoint = damagePoint;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        if (y > 0 && y < 39) {
            this.y = y;
        } else {
            this.y = 0;
        }
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        if (x > 0 && x < 39 ) {
            this.x = x;
        } else {
            this.x = 0;
        }
    }

    protected void moveUp() {
        this.setX(this.getX() - 1);
    }

    protected void moveDown() {
        this.setX(this.getX() + 1);
    }

    protected void moveLeft() {
        this.setY(this.getY() - 1);
    }

    protected void moveRight() {
        this.setY(this.getY() + 1);
    }
}
