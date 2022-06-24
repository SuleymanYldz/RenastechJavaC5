package Poly;


class Bird{
    public void sing(){
        System.out.println("cik cik cik");
    }
}
class Robin extends Bird{

}

public class Polymorphism {

    public static void main(String[] args) {

        Robin b= new Robin();
        b.sing();
    }
}
