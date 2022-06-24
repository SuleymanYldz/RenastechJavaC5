package Encapsulation;

public class Country {

    private String country;
    private String city;
    private int miles;


    public void setCountry(String country){
        this.country=country;

    }
    public String getCountry(String country){
        return country;

    }
    public void setCity(String city){
        this.city=city;

    }
    public void setMiles(int miles){
        this.miles=miles;

    }
    public String getCity(){
        return city;

    }
    public int getMiles(){
        return miles;
    }
    public String toString(){
        return city+ " is one of the biggest city in "+ country+ " and "+ miles + " away";
    }
}
