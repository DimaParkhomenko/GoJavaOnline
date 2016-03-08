package module3.ex2_aboutflowers;

public class Daisy extends Flower {

    String colour;
    String name;

    Daisy() {
        this.colour = "Yellow";
        this.name = "Daisy";
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