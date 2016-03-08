package module3.task1;

import java.util.List;

public class Directory {

    protected List<File> files;

    public List<File> getFiles() {
        return files;
    }

    public void setFiles(List<File> files) {
        this.files = files;
    }

    public void addFile(File oneFile) {
        this.files.add(oneFile);
    }
}
