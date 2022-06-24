package PracticeGeneral;

public class device {

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
    int model;
    double price;
    String country;

    public void setDeviceinfo(String brand, int model, double price,String country){

        this.brand=brand;
        this.model=model;
        this.price=price;
        this.country=country;


    }

    public void getDeviceInfo(String deviceBrand, int deviceModel,double devicePrice,String deviceCountry){
        System.out.println();
    }
    public String toString(){
        return "Brand of the car is : " + brand + "Model of " + model + "Price is : " +price +" Country: " +country;
    }
}
