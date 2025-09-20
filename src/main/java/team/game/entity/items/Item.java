package team.game.entity.items;

public enum Item {
    ITEM_EXAMPLE("Examplie item", BuffType.EXAMPLE, 0);

    private final String desc;
    private final int buffPoint;
    private final BuffType buffType;

    Item(String desc, BuffType buffType, int buffPoint) {
        this.desc = desc;
        this.buffType = buffType;
        this.buffPoint = buffPoint;
    }

    public String getDesc() {
        return desc;
    }

    public int getBuffPoint() {
        return buffPoint;
    }

    public BuffType getBuffType() {
        return buffType;
    }
}
