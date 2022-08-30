public class MainApp {

    public static void main(String[] args) {

        User bartek = new User("Bartek", "Testowy", "bartek@test.pl", 17);
        bartek.getAllInfo();


        Bug bug1 = new Bug("Some small issue", "tester@gmail.com", 1);

        bug1.getAllInfo();
        bug1.getReporter();
        System.out.println(bug1.getBugPriority());


    }


}
