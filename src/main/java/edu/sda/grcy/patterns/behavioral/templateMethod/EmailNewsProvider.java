package edu.sda.grcy.patterns.behavioral.templateMethod;

public class EmailNewsProvider extends NewsProvider {
    String email;

    public EmailNewsProvider(String message, String email) {
        super(message);
        this.email = email;
    }

    @Override
    public boolean authorize() {
        if (email != null) {
            System.out.println("Email for authorization: " + email);
            return true;
        }
        return false;
    }
}
