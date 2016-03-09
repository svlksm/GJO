package module4.task1;

import java.io.Console;
import java.util.ArrayList;

public class FigureDataCollector {

    String figure = "triangle";

    ArrayList<Double> collectedValues = new ArrayList<>();

    Console console;

    public FigureDataCollector() {
        this.console = System.console();
    }

    public void run() {
        System.out.println("Choose figure: t - triangle(default), r - rectangle, c - circle");
        String inputLine = this.console.readLine();
        inputLine = null == inputLine ? "" : inputLine;

        switch (inputLine.charAt(0)) {
            case 'r':
            case '2':
                this.getRectangleData();
                break;

            case 'c':
            case '3':
                this.getCircleData();
                break;

            default:
                this.getTriangleData();
        }

        this.showResult();
    }

    protected void getTriangleData() {
        System.out.println("Input side length:");
        String inputLine = this.console.readLine();
        this.collectedValues.add(Double.parseDouble(inputLine));

        System.out.println("Input height length:");
        inputLine = this.console.readLine();
        this.collectedValues.add(Double.parseDouble(inputLine));
    }

    protected void getRectangleData() {
        this.figure = "rectangle";

        System.out.println("Input one side length:");
        String inputLine = this.console.readLine();
        this.collectedValues.add(Double.parseDouble(inputLine));

        System.out.println("Input another side length:");
        inputLine = this.console.readLine();
        this.collectedValues.add(Double.parseDouble(inputLine));
    }

    protected void getCircleData() {
        this.figure = "circle";

        System.out.println("Input radius:");
        String inputLine = this.console.readLine();
        this.collectedValues.add(Double.parseDouble(inputLine));
    }

    protected void showResult() {
        Calculator calculator = new Calculator();
        double area = calculator.run(this.figure, this.collectedValues);

        System.out.printf("Area of %s is %.2f%n", this.figure, area);
    }
}
