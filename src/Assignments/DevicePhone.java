package Assignments;

public class DevicePhone {

    public static void main(String[] args) {

        device phone1=new device();
        phone1.setdeviceInfo("Apple", "iphone",500,"USa");

        phone1.brand="Apple ";
        phone1.model="iphone x";
        phone1.price= 500;
        phone1.country="Usa";

        System.out.println("phone1.brand = " + phone1.brand);
        System.out.println("phone1.model = " + phone1.model);
        System.out.println("phone1.price = " + phone1.price);
        System.out.println("phone1.country = " + phone1.country);


    }
}
