package Assignments;

public class phoneObject {

    public static void main(String[] args) {

        samsung samsung1=new samsung("Galaxy Note", 750,5);
        System.out.println("samsung1.model = " + samsung1.model);
        System.out.println("samsung1.price = " + samsung1.price);
        System.out.println("samsung1.size = " + samsung1.size);
        System.out.println("samsung1 = " + samsung1);
        samsung1.calling();
        samsung1.texting();


        System.out.println("-------------------------------------");

        iphone iphone=new iphone("iphone 7",250,6);
        System.out.println("iphone.model = " + iphone.model);
        System.out.println("iphone.price = " + iphone.price);
        System.out.println("iphone.size = " + iphone.size);
        System.out.println("iphone = " + iphone);

    }
}
