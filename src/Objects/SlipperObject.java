package Objects;

public class SlipperObject {

    public static void main(String[] args) {

        Slipper slipper=new Slipper();
        slipper.size=8;
        slipper.color="red";
        slipper.brand="Reebook";

        System.out.println(slipper.brand);
        System.out.println(slipper.size);
        System.out.println(slipper.color);

        slipper.wear();
        slipper.getSlipperInfo();

        System.out.println("**********************");

        Slipper slipper2=new Slipper();

       // slipper2.setsSlipperInfo("Gucci",15,"White");

        slipper2.brand="Gucci";
        slipper2.size=13;
        slipper2.color="White";

        System.out.println(slipper2.brand);
        System.out.println(slipper2.size);
        System.out.println(slipper2.color);

        slipper2.wear();
        slipper2.getSlipperInfo();

        System.out.println("****************************");

        Slipper slipper3=new Slipper();

        slipper3.brand="adidas";
        slipper3.size=7;
        slipper3.color="Pink";

        System.out.println(slipper3.brand + ","+ slipper3.size + ","+slipper3.color);
        slipper.wear();
        slipper3.getSlipperInfo();





    }
}
