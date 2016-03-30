package module10;

import java.io.*;
/*
Реализовать сохранение/загрузку текстового сообщения в файл с предварительным
шифрованием/расшифрованием. Предусмотреть обработку различных ошибок ввода/вывода
*/
public class WorkWithText {
    public static void main(String[] args) throws IOException {

        String text = "Java";

        EncryptCezar enc = new EncryptCezar(text, 2);
        DecryptionCezar dec = new DecryptionCezar(enc.getEncText(), enc.getK());

        try (FileWriter writer = new FileWriter("Text.txt")) {
            writer.write(enc.getEncText());
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        try (FileReader reader = new FileReader("Text.txt")) {
            int c;
            while ((c = reader.read()) != -1) {
                System.out.print((char) c);
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        System.out.println();

        try (FileWriter writer = new FileWriter("Text.txt")) {
            writer.write(dec.getDecText());
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        try (FileReader reader = new FileReader("Text.txt")) {
            int c;
            while ((c = reader.read()) != -1) {
                System.out.print((char) c);
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
