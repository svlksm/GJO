package module4.task2;

public class TempConverter {

    public TempConverter(String line) {
        Float result;
        char prefix = line.charAt(0);
        Float startValue = Float.parseFloat(line.substring(1));

        if ('f' == prefix) {
            result = this.toCelsius(startValue);
        } else {
            result = this.toFahrenheit(startValue);
        }
        prefix = 'f' == prefix ? 'c' : 'f';

        this.showResult(prefix, result);
    }

    protected Float toCelsius(Float temp) {
        return (temp - 32) * 5 / 9;
    }

    protected Float toFahrenheit(Float temp) {
        return temp * 9 / 5 + 32;
    }

    protected void showResult(char prefix, Float temp) {
        System.out.printf("Converted temperature is %s%.2f %n", prefix, temp);
    }
}
