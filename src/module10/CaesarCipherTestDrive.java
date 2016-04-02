package module10;

import java.io.*;
import java.util.Scanner;

public class CaesarCipherTestDrive {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Print text:");
        String text = scanner.nextLine();
        System.out.println("Print key:");
        int key = scanner.nextInt();
        System.out.println();
        System.out.println("Caesar Cipher in work:");

        try (FileWriter writer = new FileWriter("Text.txt")) {
            writer.write(encrypt(text, key));
            writer.flush();
        } catch (IOException ex) {
            System.out.println("Encrypt: " + ex.getMessage());
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
            writer.write(decrypt(encrypt(text, key), key));
            writer.flush();
        } catch (IOException ex) {
            System.out.println("Decrypt: " + ex.getMessage());
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

    public static String encrypt(String str, int keyLength) {
        String encrypted = "";
        for (int i = 0; i < str.length(); i++) {
            int c = str.charAt(i);
            if (Character.isUpperCase(c)) {
                c = c + (keyLength % 26);
                if (c > 'Z')
                    c = c - 26;
            } else if (Character.isLowerCase(c)) {
                c = c + (keyLength % 26);

                if (c > 'z')
                    c = c - 26;
            }
            encrypted = encrypted + (char) c;
        }
        return encrypted;
    }

    public static String decrypt(String str, int keyLength) {
        String decrypted = "";
        for (int i = 0; i < str.length(); i++) {

            int c = str.charAt(i);
            if (Character.isUpperCase(c)) {
                c = c - (keyLength % 26);

                if (c < 'A')
                    c = c + 26;
            } else if (Character.isLowerCase(c)) {
                c = c - (keyLength % 26);

                if (c < 'a')
                    c = c + 26;
            }
            decrypted = decrypted + (char) c;
        }
        return decrypted;
    }
}