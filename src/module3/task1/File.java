package module3.task1;

abstract public class File {

    protected String name;

    protected String extension;

    public File(String name, String extension) {
        this.name = name;
        this.extension = extension.toUpperCase();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public Boolean checkType() {
        return this.contains();
    }

    abstract protected Boolean contains();
}

