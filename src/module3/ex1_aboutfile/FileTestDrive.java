package module3.ex1_aboutfile;

public class FileTestDrive {
    public static void main(String[] args) {
        Directory directory = new Directory();

        File[] files = new File[3];
        files[0] = new AudioFile();
        files[1] = new TextFile();
        files[2] = new ImgFile();

        System.out.println("There such types of files in Directory as:");

        for (int i = 0; i < files.length; i++) {
            files[i].printFileDetails();
        }

        System.out.println("AudioFile - max size of keeping is " + directory.getAudioFile() + ";");
        System.out.println("TextFile - max size of keeping is " + directory.getImgFile() + ";");
        System.out.println("ImgFile - max size of keeping is " + directory.getTextFile() + ";");
    }
}
