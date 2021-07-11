package edu.sda.grcy.patterns.structual.proxy;

public class PublicCompanyInternetNetwork implements CompanyInternetNetwork {

    private String username;

    public PublicCompanyInternetNetwork(String username) {
        this.username = username;
    }

    @Override
    public void getAccess(String username) {
        System.out.println("Granted Public access to company network, no internal stuff avalable for " + username);
    }
}
