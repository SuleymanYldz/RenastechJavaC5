package Assignments;



public class device1 {


    String brand;
    int model;
    double price;
    String type;

    public void setDevice1Info(String brand,int model,double price,String type){
        this.brand=brand;
        this.model=model;
        this.price=price;
        this.type=type;
    }

    public String toString(){
        return "brand is :"+ brand+" "+ "Model: "+model+ " "+"Price: "+price+ " "+"Type is "+ " "+ type;
    }
}
 class Tv extends device1 {
     public void setTvInfo(String brand,int model,double price,String type){
         this.brand=brand;
         this.model=model;
         this.price=price;
         this.type=type;
         }

    public void watch(){
        System.out.println("He/ She is watching sitcom");

    }
    public String toString(){

        return "brand is :"+ brand+" "+ "Model: "+ " "+"Price: "+price+ " "+"Type is "+ " "+ type;
    }
}
class phone extends device1 {


    public void setPhoneInfo(String brand, int model, double price, String type) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.type = type;

    }
}

