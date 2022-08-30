import model.Bug;

public class MainApp {

    public static void main(String[] args) {


        // MODYFIKATORY DOSTEPU - access modifiers

        // DOMYSLNY - dziala w obrebie jednego pakietu
        // PUBLICZNY - dostep w calym projekcie

        Bug bug1 = new Bug("1", "tester@gmail.com", 1);

        bug1.setBugDescription("da");


    }


}
