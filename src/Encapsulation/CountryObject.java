package Encapsulation;

public class CountryObject {


    public static void main(String[] args) {

        Country country=new Country();
        country.setCountry("turkey");
        country.setCity("Gaziantep");
        country.setMiles(2500);
        System.out.println("country = " + country);
    }

}
