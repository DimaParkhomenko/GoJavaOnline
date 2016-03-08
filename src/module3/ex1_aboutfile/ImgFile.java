package module3.ex1_aboutfile;

public class ImgFile extends File implements Directory {
    String type;
    private String sizeOfKeeping;

    ImgFile () {
        this.type = "ImgFile";
        this.sizeOfKeeping = "50 megabytes";
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