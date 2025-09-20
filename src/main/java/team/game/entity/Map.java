package team.game.entity;

import team.game.contract.Render;
import team.game.entity.parent.AbstractBuilding;
import team.game.entity.parent.AbstractEntity;
import team.game.entity.items.Item;

/**
 * . - empty space or trap
 * @ - player
 * E - enemy
 * A - altar
 * entityList[0] - player always here
 * entityList[1=>] - enemies and other entities
 */

// homework - optimise render algorithm, now it is rewrites a map always,
// but it possible to rewrite only some parts of matrix
public class Map implements Render {
    private char[][] mapMatrix;
    private AbstractEntity[] entityList;
    private AbstractBuilding[] buildingList;
    private Item[] itemList;
    private final int matrixSide;

    public Map(int matrixSide) {
        this.matrixSide = matrixSide;
        this.mapMatrix = new char[matrixSide][matrixSide];
        this.entityList = new AbstractEntity[100];
        this.buildingList = new AbstractBuilding[100];
        this.itemList = new Item[100];
        // here you need to initialize trap array
        initialize();
    }

    private void initialize() {
        for (int x = 0; x < matrixSide; x++) {
            for (int y = 0; y < matrixSide; y++) {
                mapMatrix[x][y] = '.';
            }
        }
    }

    @Override
    public void render() {
        initialize();
        preRender();
        for (int i = 0; i < matrixSide; i++) {
            for (int j = 0; j < matrixSide; j++) {
                System.out.print(mapMatrix[i][j] + "  ");
            }
            System.out.println();
        }
    }

    private void preRender() {
        for (int i = 0; i < entityList.length; i++) {
            if (entityList[i] != null) {
                AbstractEntity currEntity = entityList[i];
                if (currEntity instanceof Player) {
                    mapMatrix[currEntity.getX()][currEntity.getY()] = '@';
                }
            }
        }

        for (int i = 0; i < buildingList.length; i++) {
            if (buildingList[i] != null) {
                // show the buildings on map, use instanceof keyword for validate
            }
        }
    }

    public char[][] getMapMatrix() {
        return mapMatrix;
    }

    public void setMapMatrix(char[][] mapMatrix) {
        this.mapMatrix = mapMatrix;
    }

    public AbstractEntity[] getEntityList() {
        return entityList;
    }

    public void setEntityList(AbstractEntity[] entityList) {
        this.entityList = entityList;
    }

    public Item[] getItemList() {
        return itemList;
    }

    public void setItemList(Item[] itemList) {
        this.itemList = itemList;
    }

    public AbstractBuilding[] getBuildingList() {
        return buildingList;
    }

    public void setBuildingList(AbstractBuilding[] buildingList) {
        this.buildingList = buildingList;
    }
}
