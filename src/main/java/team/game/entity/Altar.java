package team.game.entity;

import team.game.entity.items.BuffType;
import team.game.entity.items.Item;
import team.game.entity.parent.AbstractEntity;
import team.game.entity.parent.AbstractBuilding;

public class Altar extends AbstractBuilding {

    private final int Bonus;
    public Player player;

    // bonus=0
    public Altar(int x, int y, BuffType type, Player player) {
        super(x, y, type);
        this.Bonus = 5;
        this.player = player;
    }


    public void activating(Player player) {
        int curhp = player.getHealthPoint();
        int curdm = player.getDamagePoint();
        if (curhp != 100); {
            curhp+=Bonus;
            player.setHealthPoint(curhp);
        }
        if (curdm != 100);{
            curdm+=Bonus;
            player.setDamagePoint(curdm);
        }



        }

    }


