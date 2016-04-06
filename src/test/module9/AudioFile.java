package test.module9;

public class AudioFile extends File {

    private String typeOfFile;

    public AudioFile(String typeOfFile) {
        this.typeOfFile = typeOfFile;
    }

    public String getTypeOfFile() {
        return typeOfFile;
    }

    @Override
    public String toString() {
        return typeOfFile;
    }

}