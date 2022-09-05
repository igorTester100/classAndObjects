import model.computer.Computer;
import model.computer.Laptop;
import model.computer.PC;

public class MainApp {

    public static void main(String[] args) {

        // ABSTRAKCJA VS KONKRETNE ROZWIAZANIA

        // 1. NIE MOZNA UTWORZYC OBIEKTU KLASY ABSTRAKCYJNEJ
        // 2. JEZELI KLASA POSIADA PRZYNAJMNIEJ JEDNA METODA ABSTRAKCYJNA, TO CALA KLASA TEZ MUSI BYC ABSTRAKCYJNA
        // 3. KLASY DZIEDZICZACE MUSZA(!!!) NADPISAC WSZYSTKIE METODY ABSTRAKCYJNE Z ABSTRAKCYJNE KLASY MATKI

        Computer officeComputer = new PC("Office computer 1", "HP", 500, 128);
        Computer gamingLaptop = new Laptop("X GAME", "PRO", 500,256,100);


        System.out.println(officeComputer.volumeUp());
        System.out.println(officeComputer.volumeUp());

        System.out.println(officeComputer.volumeDown());
        System.out.println(officeComputer.volumeDown());
        System.out.println(officeComputer.volumeDown());
    }


}
