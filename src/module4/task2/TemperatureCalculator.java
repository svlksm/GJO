package module4.task2;

public class TemperatureCalculator {
    public static void main(String[] args) {
        String line;

        do {
            System.out.println("Input temperature with prefix f(fahrenheit), c(celsius)");
            line = System.console().readLine();
        } while (null == line || ('f' != line.charAt(0) && 'c' != line.charAt(0)));

        new TempConverter(line);
    }
}
