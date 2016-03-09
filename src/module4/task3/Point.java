package module4.task3;

import java.util.Scanner;

public class Point {

    static Scanner scanner = new Scanner(System.in);

    protected Integer x;

    protected Integer y;

    public Integer getX() {
        return x;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    public Integer getY() {
        return y;
    }

    public void setY(Integer y) {
        this.y = y;
    }

    public Point(int poinNumper) {
        String line;
        int counter = 0;
        int position;

        System.out.printf("Input point %s coordinates (like x,y):%n", poinNumper);
        do {
            if (counter++ > 0) {
                System.out.println("Empty value or wrong format!");
            }

            line = Point.scanner.nextLine();
            position = line.indexOf(',');
        } while (-1 == position);

        this.x = Integer.parseInt(line.substring(0,position));
        this.y = Integer.parseInt(line.substring(position+1));
    }
}
