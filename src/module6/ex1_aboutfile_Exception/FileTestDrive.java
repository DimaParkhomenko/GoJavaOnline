package module6.ex1_aboutfile_Exception;

import java.util.Scanner;

public class FileTestDrive {
    public static void main(String[] args) {
        // extracted logic into different methods to make it easier to read.
        testConsoleReadNoExceptions();
        testDirectory();
    }

    private static void testConsoleReadNoExceptions() {
        try {
            readUsersAnswer();
        } catch (WrongCharException e) {
            e.printStackTrace();
        }
        System.out.println();
    }

    private static void readUsersAnswer() throws WrongCharException {
        // this is auto-closable try-catch, it will close resources opened in
        // try()
        try (Scanner scanner = new Scanner(System.in);) {
            System.out.println("Gues what type of file is right:");
            System.out.println("These are our variants: ");
            System.out.println("AudioFile");
            System.out.println("ImgFile");
            System.out.println("TextFile");
            System.out.println("Media");
            System.out.println("Your answer");
            System.out.println();
            System.out.println("Write your answer:");
            String answer = scanner.nextLine();
            if (answer.contains("AudioFile") || answer.contains("ImgFile") || answer.contains("TextFile")) {
                System.out.println("Wright answer!!!");
            } else {
                throw new WrongCharException("Fatal Error: you'v wrote " + "\"" + answer + "\"" + " and it is wrong answer so we will die!!!  :)))");
            }
        }
    }

    private static void testDirectory() {
        Directory directory = new Directory();
        directory.putFile(new AudioFile());
        directory.putFile(new TextFile());
        directory.putFile(new ImgFile());
        directory.printFilesDetails();
    }
}