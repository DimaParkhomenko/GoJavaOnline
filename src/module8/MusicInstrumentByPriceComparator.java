package module8;

import java.util.Comparator;

class MusicInstrumentByPriceComparator implements Comparator<MusicInstruments> {

    public int compare(MusicInstruments a, MusicInstruments b) {
        if (a.getPriceOfInstruments() > b.getPriceOfInstruments())
            return 1;
        else if (a.getPriceOfInstruments() < b.getPriceOfInstruments())
            return -1;
        else
            return 0;
    }
}

