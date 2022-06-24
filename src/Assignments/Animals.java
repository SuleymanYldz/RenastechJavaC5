package Assignments;

public class Animals {

    String type;
    double age;
    String color;
    String name;


    public void getAnimalInfo(){
        System.out.println(name + "," + age + ","+ color+ ","+ type);
    }
    public void setAnimalInfo(String animalType, double animalAge, String animalColor, String animalName){

        type=animalType;
        age=animalAge;
        color=animalColor;
        name=animalName;
    }
    public void eating(String food){
        System.out.println(name + " is eating " + food);
    }
    public void getAnimalType(){
        System.out.println(name + "is a " + type);
    }
    public String toString(){

        return "Name of Animal : "+name + "age of the Animal : "+age + " color of the Animal : "+ color + "Animal type :" +type;
    }
}
