package module3.ex1_aboutfile;

public class ImgFile extends File {
    String type;
    private String sizeOfKeeping;

    ImgFile() {
        this.type = "ImgFile";
        this.sizeOfKeeping = "50 megabytes";
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