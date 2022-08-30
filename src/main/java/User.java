public class User {

    // 1. POLA OBIEKTU
    // OPISUJA Z CZEGO BEDZIE SKLADAL SIE OBIEKT

    String firstName;     // null
    String lastName;      // null
    String email;         // nul
    int age;          // 0
    boolean isAdult;      // false

    // 3. KONSTRUKTOR
    // DOMYSLNY KONSTRUKTOR - TWORZY PUSTY OBIEKT

    User(String firstName, String lastName, String email, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.age = age;
        this.isAdult = isAdult();
    }

    // NAZWA KONSTRUKTORA JEST TAKA SAMA JAK NAZWA KLASY
    // KONSTRUKTOR PISZEM WIELKA LITERA
    // KONSTRUKTOR NIE MA ZWRACANEGO TYPU




    // 2, METODY
    // OPISUJA CO DANY OBIEKT BEDZIE MOGL ZROBIC

    // zwracany typ + nazwa metody

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
