package module3.ex2_aboutflowers;

public class Astra extends Flower {

    String colour;
    String name;

    Astra() {
        this.name = "Astra";
        this.colour = "Purple";
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
