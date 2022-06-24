package Assignments;

public class device1Object extends device1{

    public static void main(String[] args) {

        device1 device=new device1();

        device.setDevice1Info("Apple",2022,500,"Ipad");
        System.out.println("device = " + device);
        System.out.println("device.brand = " + device.brand);

        System.out.println("********************************");

        Tv tv=new Tv();

        tv.setTvInfo("Samsung",2020,600,"Tv");
        System.out.println("tv = " + tv);
        System.out.println("tv.price = " + tv.price);

        System.out.println("*********************************");

        phone phone1=new phone();
        phone1.setPhoneInfo("Xiaomi",2019,1400,"Phone");
        System.out.println("phone1 = " + phone1);
        System.out.println("phone1.brand = " + phone1.brand);
    }
}
