package module4.task3;

import java.util.ArrayList;

public class DistanceCalculator {

    public Double calculate(ArrayList<Point> points) {
        Point one = points.get(0);
        Point two = points.get(1);

        return Math.sqrt( Math.pow(two.getX() - one.getX(), 2) + Math.pow(two.getY() - one.getY(), 2));
    }
}
