package Book;

public class Audiobook extends book{

    public static void main(String[] args) {

        Audiobook audiobook=new Audiobook();

        audiobook.author="Tolstoy";
        audiobook.price=10;
        audiobook.title="Novel";
        audiobook.length=250;

        System.out.println(audiobook);
        System.out.println("*****************************************");


    }
    public void Auddiobook(){
        System.out.println("I like to listen Book"+ title);
    }
    public String toSting(){
        return "Title: "+ " "+title+" "+"Author is "+author+ " "+ "$"+price+ " "+ length;
    }
}
