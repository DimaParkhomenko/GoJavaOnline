package module3.ex3_musicinstruments;

public class MusicInstrumentTestDrive {
    public static void main(String[] args) {
        MusicStore musicStore = new MusicStore();
        System.out.println("We have opened Music Store!!!");
        System.out.println("Our our range:");
        System.out.println(musicStore.getGuitar() + " which has max volume is " + musicStore.guitar.volume() + ";");
        System.out.println(musicStore.getPiano() + " which has max volume is " + musicStore.piano.volume() + ";");
        System.out.println("Well come!!!");
    }
}
