package test.module9;

abstract public class File {
    protected String typeOfFile;

    public File() {
        this.typeOfFile = this.getClass().getSimpleName();
    }

    public String getTypeOfFile() {
        return typeOfFile;
    }
}




