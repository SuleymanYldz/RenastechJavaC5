package PracticeGeneral;

public class Hondaobject {


    public static void main(String[] args) {

        Honda car=new Honda();

        car.setcarInfo("Honda","Accord",2021,"Blue",42.300);

        car.getPrice();

        System.out.println(car.model);

        Honda car2=new Honda();

        car.setcarInfo("Honda","Civic",2020,"Black",30000);

        System.out.println(car.model);
        System.out.println(car.price);
    }
}
