package module3.ex2_aboutflowers;

public class Tulip extends Flower {

    String colour;
    String name;

    Tulip() {
        this.colour = "Red";
        this.name = "Tulip";
    }

    public String getClour() {
        return colour;
    }

    public String getName() {
        return name;
    }

    public String colourOfFlower() {
        return getClour();
    }
}