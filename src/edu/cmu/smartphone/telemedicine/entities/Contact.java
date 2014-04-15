package edu.cmu.smartphone.telemedicine.entities;

public class Contact {
    private int userID;
    private String type;
    private String email;
    private String phone;
    
    private String nation; // don't store nation id local.
    private String province;
    private String city;
    
    private String name;
    private String loginID;
    
    private String intro;
    private String headPortrait; // store the picture of the user.
    
    private int age;
    private String passWord;
    
    public Contact () {
        
    }
    
    public int getUserID() {
        return userID;
    }
    
    public String getType() {
        return type;
    }
    
    public String getEmail() {
        return email;
    }
    
    public String getPhone() {
        return phone;
    }
    
    public String getNation() {
        return nation;
    }
    
    public String getProvince() {
        return province;
    }
    
    public String getCity() {
        return city;
    }
    
    public String getName() {
        return name;
    }
    
    public String getLoginID() {
        return loginID;
    }
    
    public String getIntro() {
        return intro;
    }
    
    public String getHeadPortrait() {
        return headPortrait;
    }
    
    public int getAge() {
        return age;
    }
    
    public String getPassword() {
        return passWord;
    }
    
}
