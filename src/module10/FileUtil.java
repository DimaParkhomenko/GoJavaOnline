package module10;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileUtil {

    public void read(String fileName) {
        try (FileReader reader = new FileReader(fileName)) {
            int c;
            while ((c = reader.read()) != -1) {
                System.out.print((char) c);
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void write(String filename, String textToWrite) {
        try (FileWriter writer = new FileWriter(filename)) {
            writer.write(textToWrite);
            writer.flush();
        } catch (IOException ex) {
            System.out.println("Decrypt: " + ex.getMessage());
        }
    }
}
