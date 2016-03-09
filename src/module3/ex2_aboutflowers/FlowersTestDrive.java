package module3.ex2_aboutflowers;

public class FlowersTestDrive {
    public static void main(String[] args) {
        RoseBush roseBush = new RoseBush();
        Bouquet bouquet = new Bouquet();
        System.out.println("Our bouquet consist of:");
        System.out.println(bouquet.daisy.colourOfFlower() + " " + bouquet.daisy.getName());
        System.out.println(bouquet.tulip.colourOfFlower() + " " + bouquet.tulip.getName());
        System.out.println(bouquet.astra.colourOfFlower() + " " + bouquet.astra.getName());

        System.out.println("...and rose bush contains " + roseBush.getRose() + ".");
    }
}
