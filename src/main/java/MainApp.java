import model.computer.Laptop;
import model.computer.PC;

public class MainApp {

    public static void main(String[] args) {

        //1. IS A - jest czyms - DZIEDZICZENIE
        //2. HAS A - posiada cos - KOMPOZYCJA

        PC officeComputer = new PC("Office Computer", "HP",500, 120);
        Laptop gamingLaptop = new Laptop("XGames", "HP Games", 500, 256,50);

        officeComputer.switchOn();
        gamingLaptop.switchOn();
        officeComputer.switchOn();
    }


}
