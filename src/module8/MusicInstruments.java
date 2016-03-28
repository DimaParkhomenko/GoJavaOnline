package module8;

abstract public class MusicInstruments {
    protected String typeOfInstruments;
    protected int priceOfInstruments;

    public MusicInstruments() {
        this.typeOfInstruments = this.getClass().getSimpleName();
    }
}
