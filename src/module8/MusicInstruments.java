package module8;

abstract public class MusicInstruments {
    protected String typeOfInstruments;
    protected int priceOfInstruments;

    public int getPriceOfInstruments() {
        return priceOfInstruments;
    }

    public String getTypeOfInstruments() {
        return typeOfInstruments;
    }

    public MusicInstruments() {
        this.typeOfInstruments = this.getClass().getSimpleName();
    }
}
