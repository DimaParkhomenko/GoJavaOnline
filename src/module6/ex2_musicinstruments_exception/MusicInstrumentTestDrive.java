package module6.ex2_musicinstruments_exception;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MusicInstrumentTestDrive {
    public static void main(String[] args) {
        MusicStore musicStore = new MusicStore();
        musicStore.setGuitars(52);
        musicStore.setPianos(26);
        musicStore.setTrumpets(89);

        System.out.println(musicStore);

        Map<String, Integer> order = new HashMap<>();
        order.put("guitar", 1);
        order.put("piano", 6);
        order.put("trumpet", 1);

        List<MusicInstruments> guitarsToRemove = prepareOrder(musicStore, order);
        System.out.println("removed guitars" + guitarsToRemove.size()); //выводит общее кол-во инструментов, всеравно что написать "removed pianos" + pianosToRemove.size()
        List<MusicInstruments> pianosToRemove = prepareOrder(musicStore, order);
        List<MusicInstruments> trumpetsToRemove = prepareOrder(musicStore, order);

        System.out.println(musicStore + " after removed.");//здесь выводит кол-во позиции, которые нужно удалить, умноженные на три
    }

    private static List<MusicInstruments> prepareOrder(MusicStore musicStore, Map<String, Integer> order) {
        int numberOfGuitarsToRemove = order.get("guitar");
        int numberOfPianosToRemove = order.get("piano");
        int numberOfTrumpetsToRemove = order.get("trumpet");

        if (musicStore.getGuitars() < numberOfGuitarsToRemove)
            throw new IllegalStateException("There no such amount instruments in the store.");
        if (musicStore.getPianos() < numberOfPianosToRemove)
            throw new IllegalStateException("There no such amount instruments in the store.");
        if (musicStore.getTrumpets() < numberOfTrumpetsToRemove)
            throw new IllegalStateException("There no such amount instruments in the store.");

        musicStore.setGuitars(musicStore.getGuitars() - numberOfGuitarsToRemove);
        musicStore.setPianos(musicStore.getPianos() - numberOfPianosToRemove);
        musicStore.setTrumpets(musicStore.getTrumpets() - numberOfTrumpetsToRemove);

        List<MusicInstruments> result = new ArrayList<>();
        for (int i = 0; i < numberOfGuitarsToRemove; i++) {
            result.add(new Guitar());
        }
        for (int i = 0; i < numberOfPianosToRemove; i++) {
            result.add(new Piano());
        }
        for (int i = 0; i < numberOfTrumpetsToRemove; i++) {
            result.add(new Trumpet());
        }
        return result;
    }
}