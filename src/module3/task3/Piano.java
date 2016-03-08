package module3.task3;

public class Piano extends Instrument {

    public Piano(String name) {
        super(name);
    }

    @Override
    public String playSound() {
        return "piano sound";
    }
}
