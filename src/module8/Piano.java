package module8;

import java.util.Comparator;

public class Piano extends MusicInstruments implements Comparable<Piano>{
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
    public int compareTo(Piano p){

        return typeOfInstruments.compareTo(p.getTypeOfInstruments());
    }


    /*class PianoTypeOfInstruments implements Comparator<Piano> {
        public int compare(Piano a, Piano b) {

            return a.getTypeOfInstruments().compareTo(b.getTypeOfInstruments());
        }
    }

    class PianoPriceOfInstruments implements Comparator<Piano> {

        public int compare(Piano a, Piano b) {

            if (a.getPriceOfInstruments() > b.getPriceOfInstruments())
                return 1;
            else if (a.getPriceOfInstruments() < b.getPriceOfInstruments())
                return -1;
            else
                return 0;
        }*/
    }


