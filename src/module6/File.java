package module6;

abstract public class File {

	// type is protected, so it will be available for all subclasses
	protected String type;

	// the super constructor is called before subclass constructor, so type will
	// be initialized when we create new TextFile() or new AudioFile or new
	// ImgFile() objects
	public File() {
		this.type = this.getClass().getSimpleName();
	}

	public abstract void printFileDetails();

	public String getType() {
		return type;
	}

}
