package Assignments;

public class Shoe {

    String brand;
    int size;
    String color;

    public void wear(){
        System.out.println("She/ he is wearing " + brand + " ");
    }
    public void getShoeInfo(){
        System.out.println(brand + "" + size + ""+ color);
    }
    public void setShoeInfo(String shoeBrand, int shoeSize, String shoeColor){
        brand=shoeBrand;
        size=shoeSize;
        color=shoeColor;

    }
    public String toString(){
        return brand +  " /" + size  + " /"  + color;
    }

}
