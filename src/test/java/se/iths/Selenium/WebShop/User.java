package se.iths.Selenium.WebShop;

public class User {

    String username;
    String password;
    String phone;

    public static User slaskUser(){
        return new User("slask@apa.se", "slask", "070123678");
    }

    public User(String username, String password, String phone) {
        this.username = username;
        this.password = password;
        this.phone = phone;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}

