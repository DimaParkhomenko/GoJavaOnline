package module3.ex1_aboutfile;

public class AudioFile extends File implements Directory {
    private String type;
    private String sizeOfKeeping;

    AudioFile() {
        this.type = "AudioFile";
        this.sizeOfKeeping = "100 megabytes";
    }

    public void printFileDetails() {
        System.out.print("Type: " + getType() + "; ");
        System.out.println("max size of keeping is " + maxSizeOfKeeping() + ";");
    }

    public String getType() {
        return type;
    }


    public String getSizeOfKeeping() {
        return sizeOfKeeping;
    }

    @Override
    public String maxSizeOfKeeping() {
        return getSizeOfKeeping();
    }
}
