package module8;

public class Piano extends MusicInstruments {
    private String typeOfInstruments;
    private int priceOfInstruments;

    public Piano(String typeOfInstruments, int priceOfInstruments) {
        this.typeOfInstruments = typeOfInstruments;
        this.priceOfInstruments = priceOfInstruments;
    }

    public int getPriceOfInstruments() {
        return priceOfInstruments;
    }

    public String getTypeOfInstruments() {
        return typeOfInstruments;
    }

    @Override
    public String toString() {
        return typeOfInstruments + "           " + priceOfInstruments;
    }
}