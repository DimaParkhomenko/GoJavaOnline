package module3.ex1_aboutfile;

public class TextFile extends File implements Directory {
    String type;
    private String sizeOfKeeping;

    TextFile () {
        this.type = "TextFile";
        this.sizeOfKeeping = "25 megabytes";
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