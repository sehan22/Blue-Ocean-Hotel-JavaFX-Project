package lk.ijse.model;

public class Admin {
    String userName;
    String password;

    public Admin() {
    }

    public Admin(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public String getUserName(String text) {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword(String text) {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
