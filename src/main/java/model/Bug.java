package model;

public class Bug {

    private String bugDescription;
    private String  email;
    private int bugPriority;
    private boolean bugStatus;

    public Bug(String bugDescription, String email, int bugPriority) {
        this.bugDescription = bugDescription;
        this.email = email;
        this.bugPriority = bugPriority;
        this.bugStatus = false;
    }

    public String getBugDescription() {
        return bugDescription;
    }

    public void setBugDescription(String bugDescription) {
        if(bugDescription.length() < 10) {
            System.out.println("BugDescription should have 10 character ");
        } else {
            this.bugDescription = bugDescription;
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if(!email.contains("@")) {
            System.out.println("Email should contains @.");
        } else {
            this.email = email;
        }
    }

    public void setBugPriority(int bugPriority) {
        this.bugPriority = bugPriority;
    }

    public boolean isBugStatus() {
        return bugStatus;
    }

    public void setBugStatus(boolean bugStatus) {
        this.bugStatus = bugStatus;
    }

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
