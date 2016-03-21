package module6.ex1_aboutfile_Exception;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Directory {
    // Usually directory contains just list of files
    // you can deal with files (create, copy, delete), you can list directory to
    // find out how many files it contains, or what files it contains.
    // I removed methods like getSizeOfKeeping, because directory doesn't care
    // what kinds of files it contains and how large they can be.
    // Directory can be empty, so there can be no files inside.
    private List<File> files;

    public Directory() {
        files = new ArrayList<File>();
    }

    public void putFile(File file) {
        files.add(file);
    }

    public List<File> listFiles() {
        return Collections.unmodifiableList(files);
    }

    public void printFilesDetails() {
        System.out.println("There such types of files in Directory as:");
        for (File file : files) {
            file.printFileDetails();
        }
    }
}
