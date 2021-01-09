package model;

public class User {
    private String name, age, email, password, acount, phonenumber, address;

    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAcount() {
        return acount;
    }

    public void setAcount(String acount) {
        this.acount = acount;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public User(String name, String age, String email, String password, String acount, String phonenumber, String address) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.password = password;
        this.acount = acount;
        this.phonenumber = phonenumber;
        this.address = address;
    }

    public User(String email, String password, String acount, String phonenumber) {
        this.email = email;
        this.password = password;
        this.acount = acount;
        this.phonenumber = phonenumber;
    }
}
