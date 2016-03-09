package module4.task1;

import java.util.ArrayList;

public class Calculator {

    public double run(String figure, ArrayList<Double> values) {
        double area;

        if (figure.equals("circle")) {
            area = Math.PI * Math.pow(values.get(0), 2);
        } else {
            area = values.get(0) * values.get(1);

            if (figure.equals("triangle")){
                area /= 2;
            }
        }

        return area;
    }
}
