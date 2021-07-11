package edu.sda.grcy.patterns.structual.proxy;

public class PrivateCompanyInternetNetwork implements  CompanyInternetNetwork{

    private  String username;

    public PrivateCompanyInternetNetwork(String username) {
        this.username = username;
    }

    @Override
    public void getAccess(String username) {
        System.out.println("Granted access to PRIVATE company stuff AND public network for " + username);
    }
}
