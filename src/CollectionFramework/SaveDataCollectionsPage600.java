package CollectionFramework;

import java.util.LinkedList;

public class SaveDataCollectionsPage600 {
    public static void main(String[] args) {
        LinkedList<Address> addresses = new LinkedList<>();
        addresses.add(new Address("J.W West", "11 Oak Ave", "Urbana", "1L", "61801"));
        addresses.add(new Address("P.D East", "12 Oak Ave", "Urbana", "9L", "61966"));
        addresses.add(new Address("O.K South", "13 Oak Ave", "Urbana", "6L", "77777"));

        for (Address element : addresses) {
            System.out.print(element + "\n");
        }
    }
}

class Address {
    private String name;
    private String street;
    private String city;
    private String state;
    private String code;

    public Address(String name, String street, String city, String state, String code) {
        this.name = name;
        this.street = street;
        this.city = city;
        this.state = state;
        this.code = code;
    }

    @Override
    public String toString() {
        return "Address{" +
                "name='" + name + '\'' +
                ", street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", code='" + code + '\'' +
                '}';
    }
}