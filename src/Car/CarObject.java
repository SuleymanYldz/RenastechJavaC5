package Car;

public class CarObject {

    public static void main(String[] args) {

        Honda car=new Honda("Accord",2021,32000);

        System.out.println("car.model = " + car.model);
        System.out.println("car.price = " + car.price);
        System.out.println("car.year = " + car.year);
        car.driving();
        car.autoPilot();


        System.out.println("*****************************************");

        Audi audi=new Audi("Audi A8", 2020,40000);
        System.out.println("audi.model = " + audi.model);
        System.out.println("audi.year = " + audi.year);
        System.out.println("audi.price = " + audi.price);
        audi.autoPilot();
        audi.driving();

    }
}
