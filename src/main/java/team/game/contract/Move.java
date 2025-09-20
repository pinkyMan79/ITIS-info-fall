package team.game.contract;


import team.game.contract.util.DirectionType;
import team.game.entity.abstraction.AbstractEntity;

public interface Move {
    void move(DirectionType directionType);
}
