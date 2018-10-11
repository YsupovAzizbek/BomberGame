package model;

public class Bomb extends AbstractObject {
    private static final int LIFETIME = 3000;
    private static final int BOMB_WIDTH = 28;
    private static final int BOMB_HEIGHT = 28;
    private int elapsed = 0;

    public Bomb (int x, int y) {
        super(BOMB_WIDTH, BOMB_HEIGHT, x, y);
    }

    public boolean dead() {
        return elapsed > LIFETIME;
    }
}
