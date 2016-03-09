package module4.task3;

import java.util.ArrayList;

public class Distance {
    public static void main(String[] args) {

        ArrayList<Point> points = new ArrayList<>(2);
        Point p;
        for (int i =1; i<3; i++) {
            p = new Point(i);
            points.add(p);
        }

        DistanceCalculator calc = new DistanceCalculator();
        System.out.printf("Distance is %.3f%n", calc.calculate(points));
    }
}
