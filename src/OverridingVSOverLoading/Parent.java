package OverridingVSOverLoading;


public class Parent {


    public static void main(String[] args) {


     Child child=new Child();
     child.talk();
     child.walk(80);
     child.walk();

    }


    public void  talk(){
        System.out.println("Hello");
    }
}
