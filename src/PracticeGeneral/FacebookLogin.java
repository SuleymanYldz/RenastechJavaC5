package PracticeGeneral;

public class FacebookLogin {

    private String userName;
    private String password;

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
    public void openBrowser(){
        System.out.println("Browser is started");
    }
    public void goToUrl(){
        System.out.println("we are on Facebook login page");
    }
    public void passingCredentials(String userName,String password){
        setUserName(userName);
        setPassword(password);
    }
    public void closeBrowser(){
        System.out.println("Browser is closed");
    }
}
