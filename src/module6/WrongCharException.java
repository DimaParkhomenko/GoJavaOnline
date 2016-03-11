package module6;

public class WrongCharException extends Exception{
    private String sizeOfKeeping;

    public WrongCharException(String sizeOfKeeping) {
        this.sizeOfKeeping = sizeOfKeeping;
    }

    public String getSizeOfKeeping() {
        return sizeOfKeeping;
    }
}
