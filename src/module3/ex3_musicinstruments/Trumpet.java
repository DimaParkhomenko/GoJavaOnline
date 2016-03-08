package module3.ex3_musicinstruments;

public class Trumpet extends MusicInstruments{

    String name;
    String volumeOfTrumpet;

    Trumpet() {
        this.name = "Trumpet";
        this.volumeOfTrumpet = "85 decibels";
    }

    public String getName() {
        return name;
    }

    public String getVolumeOfTrumpet() {
        return volumeOfTrumpet;
    }

    public String volume() {
        return getVolumeOfTrumpet();
    }
}