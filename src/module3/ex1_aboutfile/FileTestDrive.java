package module3.ex1_aboutfile;

public class FileTestDrive {
    public static void main(String[] args) {
        File[] files = new File[3];
        files[0] = new AudioFile();
        files[1] = new TextFile();
        files[2] = new ImgFile();

        System.out.println("There such kind of files in Directory as:");

        for (int i = 0; i < files.length; i++) {
            files[i].printFileDetails();
        }
    }
}
