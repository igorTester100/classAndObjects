public class Bug {

    // POLA OBIEKTU
    // - opis bledu
    // - adres email osoby zglaszajace blad
    // - priorytet bledu (1-5)
    // - status bledu (otwarty/ zamkniety) - domyslnie, podczas tworzenia zawsze otwarty

    private String bugDescription;
    private String  email;
    private int bugPriority;
    private boolean bugStatus;

    // KONSTRUKTOR

    Bug(String bugDescription, String email, int bugPriority) {
        this.bugDescription = bugDescription;
        this.email = email;
        this.bugPriority = bugPriority;
        this.bugStatus = false;
    }

    // METODY
    // - pokaz wszystkie informacje o bledzie
    // - pokaz osobe zglaszajace blad
    // - pokaz status bledu
    // - zwroc priorytet bledu

    public void getAllInfo() {
        System.out.println(bugDescription + " reporte by " + email + " bugPriority is " + bugPriority + bugStatus);
    }

    public void getReporter() {
        System.out.println("Reproter is " + email);
    }

    public int getBugPriority() {
        return bugPriority;
    }

    public boolean bugStatus() {
        return bugStatus;
    }

}
