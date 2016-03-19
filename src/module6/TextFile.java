package module6;

public class TextFile extends File {

	private String sizeOfKeeping;

    public TextFile() {
        this.sizeOfKeeping = "25 megabytes";
    }

    @Override
    public void printFileDetails() {
        System.out.println("Type: " + getType() + "; sizeOfKeeping=" + sizeOfKeeping );
    }

    public void setSizeOfKeeping(String sizeOfKeeping) {
        this.sizeOfKeeping = sizeOfKeeping;
    }

    public String getSizeOfKeeping() {
        return sizeOfKeeping;
    }

}