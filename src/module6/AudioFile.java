package module6;

public class AudioFile extends File {
    private String type;
    private String sizeOfKeeping;

    AudioFile() {
        this.type = "AudioFile";
        this.sizeOfKeeping = "100 megabytes";
    }

    public void printFileDetails() {
        System.out.println("Type: " + getType() + "; ");
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setSizeOfKeeping(String sizeOfKeeping) {
        this.sizeOfKeeping = sizeOfKeeping;
    }

    public String getSizeOfKeeping() {
        return sizeOfKeeping;
    }
}