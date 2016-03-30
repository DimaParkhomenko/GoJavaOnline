package module8;

import java.util.Comparator;

public class Piano extends MusicInstruments implements Comparable<Piano> {
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

    public int compareTo(Piano p) {

        return typeOfInstruments.compareTo(p.getTypeOfInstruments());
    }
}


