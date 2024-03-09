package net.ukr.mironovakatty.hw19;

public class PointRunner {
    public static void main(String[] args) throws CloneNotSupportedException {
        Point point = new Point(5, 14);
        Point anotherPoint = new Point(-39, 9);

        System.out.println("Point info: (" + point.getX() + ", " + point.getY() + ")");
        System.out.println("Another point: " + anotherPoint);
        System.out.println();

        System.out.println("Distance from point to another point: " + point.distanceTo(anotherPoint));
        System.out.println("Distance between point and another point: " + Point.distanceBetween(point, anotherPoint));
        System.out.println();

        System.out.println("Move point to (56, -8)");
        point.setX(56);
        point.setY(-8);
        System.out.println("Point: " + point);

        System.out.println();
        Point clonedPoint = point.clone();
        System.out.println("Cloned point: " + clonedPoint);
        System.out.println("cloned point == original point:   " + (clonedPoint == point));
        System.out.println("cloned point EQUALS original point:   " + clonedPoint.equals(point));


        System.out.println();
        Point copiedPoint = new Point(point);
        System.out.println("Copied point: " + copiedPoint);
        System.out.println("copied point == original point:   " + (copiedPoint == point));
        System.out.println("copied point EQUALS original point:   " + copiedPoint.equals(point));

        Point emptyPoint = new Point(null);
        System.out.println(emptyPoint);
    }
}
