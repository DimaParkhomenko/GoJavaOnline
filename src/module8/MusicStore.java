package module8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MusicStore {

    private List<MusicInstruments> musicInstruments;

    public MusicStore() {
        musicInstruments = new ArrayList<MusicInstruments>();
    }

    public void putMusicInstrument(MusicInstruments musicInstrument) {
        musicInstruments.add(musicInstrument);
    }

    public List<MusicInstruments> listMusicInstruments() {
        return Collections.unmodifiableList(musicInstruments);
    }

    public void printMusicInstrumentDetails() {
        for (MusicInstruments musicInstrument : musicInstruments) System.out.println(musicInstrument);
    }
}
