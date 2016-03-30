package module9;

public class TextFile extends File {

    private String typeOfFile;

    public TextFile(String typeOfFile) {
        this.typeOfFile = typeOfFile;
    }

    public String getTypeOfFile() {
        return typeOfFile;
    }

    @Override
    public String toString() {
        return "TextFile{" +
                "typeOfFile='" + typeOfFile + '\'' +
                '}';
    }

}