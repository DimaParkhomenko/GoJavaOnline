package module9;

import java.util.ArrayList;
import java.util.List;

public class CezarTestDrive {
    public static void main(String[] args) {
        List<File> fileList = new ArrayList<>();
        fileList.add(new AudioFile("Audio"));
        fileList.add(new TextFile("Text"));

        System.out.println(fileList);

        for (int i = 0; i < fileList.size(); i++) {
            EncryptCezar enc = new EncryptCezar(fileList.get(i));
        }

    }
}
