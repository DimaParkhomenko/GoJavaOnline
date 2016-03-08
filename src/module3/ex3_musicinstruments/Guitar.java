package module3.ex3_musicinstruments;

public class Guitar extends MusicInstruments {
    String name;
    String volumeOfGuitar;

    Guitar() {
        this.name = "Guitar";
        this.volumeOfGuitar = "55 decibels";
    }

    public String getName() {
        return name;
    }

    public String getVolumeOfGuitar() {
        return volumeOfGuitar;
    }

    public String volume() {
        return getVolumeOfGuitar();
    }
}
