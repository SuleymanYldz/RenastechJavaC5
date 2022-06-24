package Car;

public  abstract  class Car {


    static  String brand;
    String model;
    int year;
    double price;

    public abstract void  driving();
    public abstract  void autoPilot();


    public String toString(){

        return "Brand : "+ brand+ "Model : "+ model+  " year : "+ year+ "price "+ price;
    }
}
class Honda extends Car{


    static {
        brand="Honda";
    }

    @Override
    public void driving() {
        System.out.println("i am driving " + model);
    }

    @Override
    public void autoPilot() {
        System.out.println(brand + " Has autopilot");

    }
    public Honda(){

    }
    public Honda(String model,int year, double price ){

        this.model=model;
        this.price=price;
        this.year=year;
    }
}

class Audi extends Car{

    static{
        brand="Audi";
    }

    @Override
    public void driving() {

        System.out.println(" I am driving " + model);

    }

    @Override
    public void autoPilot() {
        System.out.println(brand + "Has autopilot");

    }
    public Audi(){

    }
    public Audi(String model, int year, double price){

        this.model=model;
        this.price=price;
        this.year=year;
    }
}

