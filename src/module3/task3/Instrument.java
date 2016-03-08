package module3.task3;

public abstract class Instrument {

    protected String name;

    protected Boolean hasStrings = false;

    public Instrument() {
        super();
    }

    public Instrument(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean hasStrings() {
        return hasStrings;
    }

    public void setHasStrings(Boolean hasStrings) {
        this.hasStrings = hasStrings;
    }

    abstract public String playSound();
}
