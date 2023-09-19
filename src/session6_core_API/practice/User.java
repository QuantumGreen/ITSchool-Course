package session6_core_API.practice;

import java.util.UUID;

public class User {
    private UUID userID;
    private String firstName;
    private String lastName;
    private int age;
    private boolean oldCustomer;
    private UserAddress userAddress;
    private String email;
    private String phoneNumber;
    private String signInDate;
    private float currency;
    private String password;

    public UUID getUserID() {
        return userID;
    }

    public void setUserID(UUID userID) {
        this.userID = userID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isOldCustomer() {
        return oldCustomer;
    }

    public void setOldCustomer(boolean oldCustomer) {
        this.oldCustomer = oldCustomer;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getSignInDate() {
        return signInDate;
    }

    public void setSignInDate(String signInDate) {
        this.signInDate = signInDate;
    }

    public float getCurrency() {
        return currency;
    }

    public void setCurrency(float currency) {
        this.currency = currency;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
