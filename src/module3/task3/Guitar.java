package module3.task3;

public class Guitar extends Instrument {

    public Guitar() {
        super();

        this.hasStrings = true;
    }

    public Guitar(String name) {
        super(name);

        this.hasStrings = true;
    }

    @Override
    public String playSound() {
        return "guitar sound";
    }
}
