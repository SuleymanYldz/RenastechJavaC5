package Assignments;

public class device {

    // Task Device:
//    creata a class called device:
//        attributes: brand, model, price, country
//        methods: toString
//
//    create a class called TV:
//        attributes: brand, model, price, country
//        methods: watch, toString
//
//    create a class called phone:
//        attributes: brand, model, price, country
//        methods: call, text, toString


    String brand;
    String model;
    double price;
    String country;

    public void setdeviceInfo(String brand, String model, double price, String country){

        this.brand=brand;
        this.model=model;
        this.price=price;
        this.country=country;

    }
    public String toString(){

        return brand + model + price + country ;

    }

}
