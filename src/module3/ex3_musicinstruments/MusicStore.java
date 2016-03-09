package module3.ex3_musicinstruments;

public class MusicStore {
    Guitar guitar;
    Piano piano;

    MusicStore(){
        this.guitar = new Guitar();
        guitar.setName("Guitar of Jimmy Handriks");
        this.piano = new Piano();
        piano.setName("Piano of Mozart");
    }

    public String getGuitar() {
        return guitar.getName();
    }

    public String getPiano() {
        return piano.getName();
    }
}
