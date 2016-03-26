package module6.ex2_musicinstruments_exception;

public class MusicStore {
    int pianos;
    int guitars;
    int trumpets;

    public void setPianos(int pianos) {
        this.pianos = pianos;
    }

    public void setGuitars(int guitars) {
        this.guitars = guitars;
    }

    public void setTrumpets(int trumpets) {
        this.trumpets = trumpets;
    }

    public int getPianos() {
        return pianos;
    }

    public int getGuitars() {
        return guitars;
    }

    public int getTrumpets() {
        return trumpets;
    }

    @Override
    public String toString() {
        return "MusicStore contains " + "guitars=" + guitars + ", pianos=" + pianos + ", trumpets=" + trumpets;

    }
}


