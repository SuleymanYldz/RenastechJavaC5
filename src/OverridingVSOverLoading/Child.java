package OverridingVSOverLoading;

public class Child extends Parent {


    public void talk(){
        System.out.println(" I like to talk");

    }
    public void walk(){

        System.out.println("I didint walk today");
    }
    public void walk(int miles){
        System.out.println("I walked "+ miles + " today");
    }

}


