package module3.ex3_musicinstruments;

public class Piano extends MusicInstruments{

    String name;
    String volumeOfPiano;

    Piano() {
        this.name = "Piano";
        this.volumeOfPiano = "80 decibels";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVolumeOfPiano() {
        return volumeOfPiano;
    }

    public String volume() {
        return getVolumeOfPiano();
    }
}