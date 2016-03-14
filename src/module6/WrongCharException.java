package module6;

public class WrongCharException extends Exception {
    private String type;

    public WrongCharException(String type) {
        this.type = type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
