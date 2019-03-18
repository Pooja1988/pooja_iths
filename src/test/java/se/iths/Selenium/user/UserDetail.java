package se.iths.Selenium.user;

public class UserDetail {

    private String Id;
    private String UserName;
    private String FirstName;
    private String LastName;
    private String Email;
    private String PassWord;
    private String Phone;
    private String UserStatus;

    public UserDetail(String id, String userName, String FirstName, String lastName, String email, String passWord, String phone, String userStatus) {
        Id = id;
        UserName = userName;
        this.FirstName = FirstName;
        LastName = lastName;
        Email = email;
        PassWord = passWord;
        Phone = phone;
        UserStatus = userStatus;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String FIrstName) {
        this.FirstName = FIrstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPassWord() {
        return PassWord;
    }

    public void setPassWord(String passWord) {
        PassWord = passWord;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public String getUserStatus() {
        return UserStatus;
    }

    public void setUserStatus(String userStatus) {
        UserStatus = userStatus;
    }
}
