package geometry;

public class Bar {
    Point reght.Point;
    Point left.Point;

   package geometry;

    public class Bar implements Collider {
        private Point rightPoint; //upper right corner
        private Point leftPoint; //lower left corner

        public Bar(int x, int y, int x1, int y1){
            this.rightPoint = new Point(Math.max(x, x1), Math.max(y, y1));
            this.leftPoint = new Point(Math.min(x, x1), Math.min(y, y1));
        }

        @Override
        public boolean isColliding(Collider other) {
            return false;
        }

        public Point getRightPoint() {
            return rightPoint;
        }

        public Point getLeftPoint() {
            return leftPoint;
        }
    }
}
