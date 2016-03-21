package module6.ex2_musicinstruments_exception;

abstract public class MusicInstruments {
    public abstract String getType();

    @Override
    public String toString() {
        return "MusicInstrument {" + getType() + "}";
    }

}


