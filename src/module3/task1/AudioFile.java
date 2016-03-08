package module3.task1;

public class AudioFile extends File {

    enum AudioExtensions {WMV, MP3}

    public AudioFile(String name, String extension) {
        super(name, extension);
    }

    protected Boolean contains() {
        for (AudioExtensions c : AudioExtensions.values()) {
            if (c.name().equals(this.extension)) {
                return true;
            }
        }

        return false;
    }
}
