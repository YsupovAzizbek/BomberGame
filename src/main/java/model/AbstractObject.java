package model;

import geometry.Point;

public abstract class AbstractObject{
    private Point position;
    private final int boxWidth = 32;
    private final int boxHeight = 32;
    private final int id;
    private final int width;
    private final int height;

    public AbstractObject(int width, int height, int x, int y){
        this.width = width;
        this.height = height;
        this.position = new Point(x, y);
    }
}
