package module8;

public class Trumpet extends MusicInstruments {
    private String typeOfInstruments;
    private int priceOfInstruments;

    public Trumpet(String typeOfInstruments, int priceOfInstruments) {
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
        return typeOfInstruments + "         " + priceOfInstruments;
    }
}