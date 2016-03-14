package module6;


public class Directory {
    private TextFile textFile;
    private ImgFile imgFile;
    private AudioFile audioFile;

    public Directory() {
        this.textFile = new TextFile();
        textFile.setSizeOfKeeping("99 megabytes");
        this.imgFile = new ImgFile();
        imgFile.setSizeOfKeeping("919 megabytes");
        this.audioFile = new AudioFile();
        audioFile.setSizeOfKeeping("929 megabytes");
    }

    public String getTextFile() {
        return textFile.getSizeOfKeeping();
    }

    public String getImgFile() {
        return imgFile.getSizeOfKeeping();
    }

    public String getAudioFile() {
        return audioFile.getSizeOfKeeping();
    }
}
