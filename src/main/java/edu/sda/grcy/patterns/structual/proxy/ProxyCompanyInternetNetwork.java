package edu.sda.grcy.patterns.structual.proxy;

/**
 * Proxy może być warstwą zabezpieczają albo cache (pamięć podręczna)
 * W pierszym przypadku to warstwa zabezpieczająca
 * Przed przyznaniem dostępu sprawdzamy czy człowiek który prosi o dostęp do sieci
 * jest pracownikiem firmy czy nie i dajemy albo dostęp do wszystkich zasobów
 * albo tylko do tych niefirmowych
 *
 * Proxy charakteryzuje się tym że implementuje go klasa z tej samej rodziny
 * co klasy właściwe (u nas ten sam interface CompanyInternetNetwork)
 * Dostęp do klas "właściwych" powinien być zapewniony tylko z poziomu proxy
 */

public class ProxyCompanyInternetNetwork implements CompanyInternetNetwork {
    CompanyInternetNetwork internetNetwork;

    @Override
    public void getAccess(String username) {
        if (isEmployee(username)){
            internetNetwork = new PrivateCompanyInternetNetwork(username);
        } else {
            internetNetwork = new PublicCompanyInternetNetwork(username);
        }
        internetNetwork.getAccess(username);
    }

    private boolean isEmployee (String username) {
        return CompanyEmployees.isActiveEmployee(username);
    }
}
