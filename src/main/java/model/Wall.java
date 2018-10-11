package model;

public class Wall extends AbstractObject{
    private static final int WALL_WIDTH = 32;
    private static final int WALL_HEIGTH = 32;

    public Wall(int x, int y) {
        super(WALL_WIDTH, WALL_HEIGTH, x, y);
    }
}


