package module3.ex2_aboutflowers;

public class Tulip extends Flower {

    String colour;
    String name;

    Tulip() {
        this.colour = "Red";
        this.name = "Tulip";
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String colourOfFlower() {
        return getColour();
    }

}
