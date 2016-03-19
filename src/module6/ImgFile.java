package module6;

public class ImgFile extends File {

	private String sizeOfKeeping;

	public ImgFile() {
		this.sizeOfKeeping = "50 megabytes";
	}

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