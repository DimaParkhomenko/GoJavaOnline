package module3.ex2_aboutflowers;

public class Rose extends Flower implements RoseBush {

    String colour;
    String name;

    Rose() {
        this.colour = "Red";
        this.name = "Rose";
    }

    public String getColour() {
        return colour;
    }

    public String getName() {
        return name;
    }

    public String colourOfFlower() {
        return getColour();
    }

    @Override
    public int amountOfRoses() {
        return 3;
    }
}
