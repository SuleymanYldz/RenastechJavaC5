package Objects;

public class Slipper {

    // /*task1
// create a class called slipper //Attributes:
// brand, size , color
//Actions:
    // wear(), setSlipperInfo, toString;
    //
    //create a slipper object class to set 5 slipperobjectst and print slipper info // */
    // /*


    String brand;
    int size;
    String color;

    public void  wear(){

        System.out.println("He / She is wearing " + brand + ". ");

    }
    public void getSlipperInfo() {
        System.out.println(brand + "," + size + "," + color);
    }

    public void setsSlipperInfo(String SlipperBrand, int SlipperSize, String SlipperColor){

        brand=SlipperBrand;
        size=SlipperSize;
        color=SlipperColor;

    }
    public String toString(){

        return brand + " " + size + " " + color;

    }



    }
