package edu.sda.grcy.patterns.structual.facade;

import java.sql.Connection;

public class MySQLReportGenerator {
    public static Connection getMySQLConnction(){
        //tu powinna być definicja połączenia z MySQL
        System.out.println("Lączymy się z bazą MySQL");
        return null;
    }

    public MySQLReportGenerator () {
        System.out.println("Tworzymy obiekt generatora raportów");
    }

    public void generateMySQLPDFreport (String table, Connection conn){
        System.out.println("Drukujemy raport PDF z tabeli " + table + " z bazy MySQL");
    }

    public void generateMySQLHTMLreport (String table, Connection conn){
        System.out.println("Drukujemy raport HTML z tabeli " + table + " z bazy MySQL");
    }
}
