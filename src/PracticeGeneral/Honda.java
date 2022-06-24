package PracticeGeneral;

public class Honda {


    static String brand="HONDA";
    String model;
    int year;
    String color;
    double price;


    public void setcarInfo(String brand , String model, int year, String color,double price){

       this.brand=brand;
       this.model=model;
       this.year=year;
       this.price=price;
       this.color=color;


    }
    public double getPrice(){

        return price;

    }
    public String toString(){

        return "Brand is " + brand + "Model is " + model + "Color is " +color + "Price " + price + "Year" + year;
    }
}
