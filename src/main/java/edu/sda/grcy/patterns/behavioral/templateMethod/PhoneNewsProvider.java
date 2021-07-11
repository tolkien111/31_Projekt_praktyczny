package edu.sda.grcy.patterns.behavioral.templateMethod;

public class PhoneNewsProvider extends NewsProvider {
    private  String phoneNumber;

    public PhoneNewsProvider(String message, String phoneNumber) {
        super(message);
        this.phoneNumber = phoneNumber;
    }

    @Override
    public boolean authorize() {
        if(phoneNumber != null){
            System.out.println("Authorised with phone number :" + phoneNumber);
            return true;
        }
        return false;
    }

    @Override
    public boolean endConnection() {
        System.out.println("Connection terminated");
        return super.endConnection();
    }
}
