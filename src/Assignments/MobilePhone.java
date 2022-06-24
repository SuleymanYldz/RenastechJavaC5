package Assignments;

 public abstract class MobilePhone {

     public static String brand;
     String model;
     double price;
     int size;

     public abstract void calling();
      public abstract void texting();

     public String toString() {
         return "Phone brand: "+ brand + " Phone Model " + model + " phone price : "+ price;
     }


}
class iphone extends  MobilePhone{

     static {
         brand="Apple";
     }
     public void calling(){
         System.out.println("Calling from iphone");
     }
     public void texting(){
         System.out.println("Texting from iphone");
     }


     public iphone(){

     }
     public iphone(String model, double price, int size){

         this.model=model;
         this.price=price;
         this.size=size;
     }
}
class samsung extends MobilePhone{

     static {
         brand="Samsung";
     }

    @Override
    public void calling() {
        System.out.println("Calling from Samsung");
    }

    @Override
    public void texting() {
        System.out.println("Texting from Samsung");
    }

    public samsung() {

    }
    public samsung(String model, double price, int size){

        this.model=model;
        this.price=price;
        this.size=size;
    }
}