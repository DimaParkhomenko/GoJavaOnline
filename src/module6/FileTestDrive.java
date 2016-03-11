package module6;

public class FileTestDrive {
    public static void main(String[] args) {
        Directory directory = new Directory();

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
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }

        System.out.println();
        try {
            int i = 0;
            String mistake = "2";
            if (arrCheckSizeOfKeeping[i].contains(mistake)) {
                i++;
                throw new WrongCharException(arrCheckSizeOfKeeping[i]);
            }

        } catch (WrongCharException e) {
            System.out.println("Error: some of files has wrong char - '2' ");
        }
        System.out.println();
        System.out.println("AudioFile - max size of keeping is " + directory.getAudioFile() + ";");
        System.out.println("TextFile - max size of keeping is " + directory.getImgFile() + ";");
        System.out.println("ImgFile - max size of keeping is " + directory.getTextFile() + ";");
    }
}
