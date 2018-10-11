package geometry;

import java.util.Objects;

public class Point implements Collider {
    private final int x;
    private final int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean isColliding(Collider other) {
        if (other instanceof Point) {
            return this.equals(other);
        }
        if (other instanceof Bar) {
            Bar b = (Bar) other;
            return b.getLeftPoint().getX() <= this.x && this.x <= b.getRightPoint().getX()
                    && this.y <= b.getRightPoint().getY() && this.y >= b.getLeftPoint().getY();
        }
        return false;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return x == point.x &&
                y == point.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}
