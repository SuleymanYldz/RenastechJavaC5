package Book;

public class PaperBook extends book {

    int pages;

    public static void main(String[] args) {

        PaperBook paperBook = new PaperBook();
        paperBook.author = "Anonim";
        paperBook.title = "Magazine";
        paperBook.pages = 40;
        paperBook.price = 13;
        System.out.println("paperBook = " + paperBook);
    }

    public void read() {
        System.out.println("I like to read novels"+title);
    }

    public String toString() {
        return "Title: " + " " + title + " " + "Author is " + author + " " + "$" + price + " " + length;
    }
}
