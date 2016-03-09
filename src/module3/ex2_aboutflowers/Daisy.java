package module3.ex2_aboutflowers;

public class Daisy extends Flower {

    String colour;
    String name;

    Daisy() {
        this.colour = "Yellow";
        this.name = "Daisy";
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
