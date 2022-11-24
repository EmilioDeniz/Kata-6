package kata;

import java.util.List;

public class Person {
    private final String name;
    private final String birthday;
    private final List<Address> addresses;

    public Person(String name, String birthday, List<Address> addresses) {
        this.name = name;
        this.birthday = birthday;
        this.addresses = addresses;
    }
    
    public static class Address {
        private final String street;
        private final int number;
        private final String postalCode;

        public Address(String street, int number, String postalCode) {
            this.street = street;
            this.number = number;
            this.postalCode = postalCode;
        }
        
                
    }

}