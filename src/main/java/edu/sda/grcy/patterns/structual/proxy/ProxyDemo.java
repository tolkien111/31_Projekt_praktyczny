package edu.sda.grcy.patterns.structual.proxy;

public class ProxyDemo {
    public static void main(String[] args) {
        CompanyEmployees companyEmployees = new CompanyEmployees();
        companyEmployees.addEmployee("Jan Kowalski");
        companyEmployees.addEmployee("Zofia Nowak");
        companyEmployees.addEmployee("Piotr Bysiewicz");

        CompanyInternetNetwork internetNetwork = new ProxyCompanyInternetNetwork();

        internetNetwork.getAccess("Jan Kowalski");
        internetNetwork.getAccess("Jan Nowak");
        internetNetwork.getAccess("Zofia Nowak");
        internetNetwork.getAccess("Paweł Bysiewicz");

    }
}
