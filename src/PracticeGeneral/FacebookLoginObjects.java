package PracticeGeneral;

public class FacebookLoginObjects {

    public static void main(String[] args) {

        FacebookLogin object1=new FacebookLogin();
    object1.setUserName("Suleyman");
    object1.setPassword("slymn");
        System.out.println("object1.getUserName() = " + object1.getUserName());
        System.out.println("object1.getPassword() = " + object1.getPassword());

        Facebookchrome chrome=new Facebookchrome();
        chrome.openBrowser();
        chrome.goToUrl();
        chrome.passingCredentials("Java","java1454");
        System.out.println("chrome.getPassword() = " + chrome.getPassword());
        System.out.println("chrome.getUserName() = " + chrome.getUserName());
        chrome.closeBrowser();
        
    }
}
