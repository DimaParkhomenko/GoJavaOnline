package module3.ex2_aboutflowers;

public class RoseBush {
    private Rose rose;

    RoseBush(){
        this.rose = new Rose();
        rose.setName("White roses");
    }

    public String getRose() {
        return rose.getName();
    }
}
