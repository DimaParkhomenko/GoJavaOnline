package test.module10;

import java.io.IOException;
import java.util.Scanner;

public class CaesarCipherTestDrive {
    public static void main(String[] args) throws IOException {

        CeasarCipher ceasarCipher = new CeasarCipher();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Print text:");
        String text = scanner.nextLine();
        System.out.println("Print key:");
        int key = scanner.nextInt();
        System.out.println();
        System.out.println("Caesar Cipher in work:");

        FileUtil fileUtil = new FileUtil();
        fileUtil.write("Text.txt", ceasarCipher.encrypt(text, key));
        fileUtil.read("Text.txt");
        System.out.println();
        fileUtil.write("Text.txt", ceasarCipher.decrypt(ceasarCipher.encrypt(text, key), key));
        fileUtil.read("Text.txt");
    }
}