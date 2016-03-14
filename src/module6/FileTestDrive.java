package module6;

import java.util.Scanner;

public class FileTestDrive {
    public static void main(String[] args) {
        Directory directory = new Directory();
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        try {
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
                throw new WrongCharException(answer);
            }
        } catch (WrongCharException e) {
            System.out.println("Fatal Error: you'v wrote " + "\"" + e.getType() + "\"" + " and it is wrong answer so we will die!!!  :)))");
        }
        System.out.println();

        File[] files = new File[3];
        files[0] = new AudioFile();
        files[1] = new TextFile();
        files[2] = new ImgFile();
        String[] arrCheckSizeOfKeeping = new String[3];
        arrCheckSizeOfKeeping[0] = directory.getAudioFile();
        arrCheckSizeOfKeeping[1] = directory.getImgFile();
        arrCheckSizeOfKeeping[2] = directory.getTextFile();

        System.out.println("There such types of files in Directory as:");
        try {
            for (int i = 0; i < files.length; i++) {
                files[i].printFileDetails();
            }
        } catch (Exception e) {
            System.out.println(e);
        }


        System.out.println();
        System.out.println("Some others information about files:");
        System.out.println("AudioFile - max size of keeping is " + directory.getAudioFile() + ";");
        System.out.println("TextFile - max size of keeping is " + directory.getImgFile() + ";");
        System.out.println("ImgFile - max size of keeping is " + directory.getTextFile() + ".");
    }
}
