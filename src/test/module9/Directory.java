package test.module9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Directory {



    public Directory() {
        files = new ArrayList<File>();
    }

    public void putFile(File file) {
        files.add(file);
    }

    public List<File> listFiles() {
        return Collections.unmodifiableList(files);
    }

    public List<File> getFiles() {
        return files;
    }

    @Override
    public String toString() {
        return "Directory{" +
                "files=" + files +
                '}';
    }

    private List<File> files;
}