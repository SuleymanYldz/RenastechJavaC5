package Objects;

public class Car {

   // /*task2
 // create a class called Car
 //Attributes:
 // brand, model
 //Actions:

// printBrand(), -- to print car brand
// drive() , -- to print person drive car brand
// stop() -- to print person stopped the car brand
// //setCarinfo() to set car brand and model
// //toString to print car brand and model with -
// */

    String brand;
    String model;

    public void printBrand(){

        System.out.println("Brand of the Car :" + brand);
    }
    public void driver(){
        System.out.println("person driver " + brand+  "car");

    }
    public void stop(){

        System.out.println("person stopped the car " + brand);
    }


    public void getCarInfo(){

        System.out.println(brand + ","+ model);

    }
    public void setCarInfo(String Carbrand,  String Carmodel){
        brand=Carbrand;
        model=Carmodel;

    }
    public String toString(){

        return brand + ""+ ","+ model;
    }

    public static void main(String[] args) {

        Car car=new Car();

        car.brand="Honda";
        car.model="Accord";

        System.out.println(car);
        car.getCarInfo();


        Car car2=new Car();

        car2.setCarInfo("Audi", "A5");
        car2.printBrand();
        car2.driver();
        car2.stop();

        System.out.println(car2);

        Car car3=new Car();

        car3.setCarInfo("BMW", "X5");
        System.out.println(car3.model);
        car3.driver();
    }
}
