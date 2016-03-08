package module3.task1;

public class TextFile extends File {

    enum TextExtensions {TXT, RTF, MD}

    public TextFile(String name, String extension) {
        super(name, extension);
    }

    @Override
    public Boolean checkType() {
        return this.contains() || this.name.equals(""); // .gitignore etc.
    }

    protected Boolean contains() {
        for (TextExtensions c : TextExtensions.values()) {
            if (c.name().equals(this.extension)) {
                return true;
            }
        }

        return false;
    }
}
