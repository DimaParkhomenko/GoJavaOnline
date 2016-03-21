package module6.ex2_musicinstruments_exception;

import java.util.List;

public class MusicStore {
    List<Piano> pianos;
    List<Guitar> guitars;
    List<Trumpet> trumpets;

    public List<Piano> getPianos() {
        return pianos;
    }

    public void setPianos(List<Piano> pianos) {
        this.pianos = pianos;
    }

    public List<Guitar> getGuitars() {
        return guitars;
    }

    public void setGuitars(List<Guitar> guitars) {
        this.guitars = guitars;
    }

    public List<Trumpet> getTrumpets() {
        return trumpets;
    }

    protected void setTrumpets(List<Trumpet> trumpets) {
        this.trumpets = trumpets;
    }

    @Override
    public String toString() {
        return "MusicStore {" + "guitars=" + guitars.size() + ", pianos=" + pianos.size() + ", trumpets=" + trumpets.size() + '}';

    }
}


