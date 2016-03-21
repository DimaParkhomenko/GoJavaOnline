package module6.ex1_aboutfile_Exception;

public class AudioFile extends File {
    private String sizeOfKeeping;

    public AudioFile() {
        this.sizeOfKeeping = "100 megabytes";
    }

    // we put @Override annotation to confirm that we indeed implementing (overrding)
    // parrent's method.
    @Override
    public void printFileDetails() {
        System.out.println("Type: " + getType() + "; sizeOfKeeping=" + sizeOfKeeping);
    }

    public void setSizeOfKeeping(String sizeOfKeeping) {
        this.sizeOfKeeping = sizeOfKeeping;
    }

    public String getSizeOfKeeping() {
        return sizeOfKeeping;
    }
}