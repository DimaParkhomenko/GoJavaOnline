package module3.ex2_aboutflowers;

public class Bouquet {

    Astra astra;
    Daisy daisy;
    Tulip tulip;

    Bouquet(){
        this.astra = new Astra();
        astra.setName("Astra");
        this.daisy = new Daisy();
        daisy.setName("Daisy");
        this.tulip = new Tulip();
        tulip.setName("Tulip");
    }

    public String getAstra() {
        return astra.getName();
    }

    public String getDaisy() {
        return daisy.getName();
    }

    public String getTulip() {
        return tulip.getName();
    }
}

