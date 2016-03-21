package module6.ex2_musicinstruments_exception;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MusicInstrumentTestDrive {
    public static void main(String[] args) {
        MusicStore musicStore = new MusicStore();
        ArrayList<Guitar> guitars = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            guitars.add(new Guitar());
        }
        musicStore.setGuitars(guitars);

        ArrayList<Piano> pianos = new ArrayList<>();
        for (int i = 0; i < 56; i++) {
            pianos.add(new Piano());
        }
        musicStore.setPianos(pianos);

        ArrayList<Trumpet> trumpets = new ArrayList<>();
        for (int i = 0; i < 41; i++) {
            trumpets.add(new Trumpet());
        }
        musicStore.setTrumpets(trumpets);

        System.out.println(musicStore);

        Map<String, Integer> order = new HashMap<>();
        order.put("guitars", 23);
        order.put("pianos", 2);
        order.put("trumpets", 32);

        List<MusicInstruments> guitarsToRemove = prepareOrder(musicStore, order);
        System.out.println("removed guitars: " + guitarsToRemove.size());
        List<MusicInstruments> pianosToRemove = prepareOrder(musicStore, order);
        System.out.println("removed pianos: " + pianosToRemove.size());
        List<MusicInstruments> trumpetsToRemove = prepareOrder(musicStore, order);
        System.out.println("removed trumpets: " + trumpetsToRemove.size());


        System.out.println(musicStore);

    }

    private static List<MusicInstruments> prepareOrder(MusicStore musicStore, Map<String, Integer> order) {
        ArrayList<MusicInstruments> result = new ArrayList<>();

        List<Guitar> guitars = musicStore.getGuitars();
        int numberOfGuitarsToRemove = order.get("guitars");

        if (musicStore.getGuitars().size() < numberOfGuitarsToRemove) throw new IllegalStateException();
        List<Guitar> guitarsToRemove = musicStore.getGuitars().subList(0, numberOfGuitarsToRemove);
        List<Guitar> guitarsToStay = musicStore.getGuitars().subList(numberOfGuitarsToRemove, guitars.size());
        musicStore.setGuitars(guitarsToStay);
        result.addAll(guitarsToRemove);


        List<Piano> pianos = musicStore.getPianos();
        int numberOfPianoToRemove = order.get("pianos");

        if (musicStore.getPianos().size() < numberOfPianoToRemove) throw new IllegalStateException();
        List<Piano> pianosToRemove = musicStore.getPianos().subList(0, numberOfPianoToRemove);
        List<Piano> pianosToStay = musicStore.getPianos().subList(numberOfPianoToRemove, pianos.size());
        musicStore.setPianos(pianosToStay);
        result.addAll(pianosToRemove);


        List<Trumpet> trumpets = musicStore.getTrumpets();
        int numberOfTrumpetsToRemove = order.get("trumpets");

        if (musicStore.getTrumpets().size() < numberOfTrumpetsToRemove) throw new IllegalStateException();
        List<Trumpet> trumpetsToRemove = musicStore.getTrumpets().subList(0, numberOfTrumpetsToRemove);
        List<Trumpet> trumpetsToStay = musicStore.getTrumpets().subList(numberOfTrumpetsToRemove, trumpets.size());
        musicStore.setTrumpets(trumpetsToStay);
        result.addAll(trumpetsToRemove);

        return result;
    }
}
