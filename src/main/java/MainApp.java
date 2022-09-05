import model.computer.Computer;
import model.computer.Laptop;
import model.computer.PC;

public class MainApp {

    public static void main(String[] args) {


        // POLIMORFIZM - WIELE FORM

        PC officeComputer1 = new PC("Office computer 1", "HP",500,128);
        Computer officeComputer2 = new PC("Office computer 2", "HP", 500,128);
        Computer officeComputer3 = new PC("Office computer 3", "HP", 500,128);
        Computer gamingLaptop = new Laptop("XGames", "HP GAMES", 500, 256,50);
        Computer macbook = new Laptop("HB PRO", "PRO", 500, 256, 100);

        Computer[] computers = {officeComputer1, officeComputer2, officeComputer3, gamingLaptop, macbook};

        for(Computer computer : computers) {
            computer.switchOff();
        }

        officeComputer1.showComputerName();

        // RZUTOWANIE TYPU
        ((PC)officeComputer2).showComputerName();


    }


}
