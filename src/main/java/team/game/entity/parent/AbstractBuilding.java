package team.game.entity.parent;

import team.game.entity.items.BuffType;

// altar or trap abstraction
public abstract class AbstractBuilding {

    private final int x;
    private final int y;
    private final BuffType type;

    protected AbstractBuilding(int x, int y, BuffType type) {
        this.x = x;
        this.y = y;
        this.type = type;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public BuffType getType() {
        return type;
    }
}
