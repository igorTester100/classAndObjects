package model;

public class User {

    private String firstName;
    private String lastName;
    private String email;
    private int age;
    private boolean isAdult;

    public User(String firstName, String lastName, String email, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.age = age;
        this.isAdult = isAdult();
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if(email.endsWith(".rrr")) {
            System.out.println("Invalid email format");
        } else {
            this.email = email;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAdult(boolean adult) {
        isAdult = adult;
    }

    void getFullName() {
        // cialo metody
        System.out.println(firstName + " " + lastName);
    }

    void getAllInfo() {
        System.out.println(firstName + " " + lastName + " " + email + " " + age + " " + isAdult);
    }

    int getUserAge() { return age; }

    boolean isAdult() {
        if (age >= 18) {
            return true;
        } else {
            return false;
        }
    }

    void greetings(String name) {
        System.out.println("Hi " + name  + ". Nice to see you!");
    }

    void greeting(String name, String lastName) {
        System.out.println("Hi " + name + " " + lastName + ". Nice to see you!");
    }

    void howOldAreYou(int userAge) {
        System.out.println("Your userAge is " + userAge);
    }

    int yourAgePlus(int userAge) {return userAge+10;}

}
