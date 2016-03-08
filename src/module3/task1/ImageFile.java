package module3.task1;

public class ImageFile extends File {

    enum ImageExtensions {PNG, JPG, BMP}

    public ImageFile(String name, String extension) {
        super(name, extension);
    }

    protected Boolean contains() {
        for (ImageExtensions c : ImageExtensions.values()) {
            if (c.name().equals(this.extension)) {
                return true;
            }
        }

        return false;
    }
}
