package edu.sda.grcy.patterns.structual.facade;

import java.sql.Connection;

public class OracleReportGenerator {
    public static Connection getOracleConnction(){
        //tu powinna być definicja połączenia z Oracle
        System.out.println("Lączymy się z bazą MySQL");
        return null;
    }

    public OracleReportGenerator () {
        System.out.println("Tworzymy obiekt generatora raportów");
    }

    public void generateOraclePDFreport (String table, Connection conn){
        System.out.println("Drukujemy raport PDF z tabeli " + table + " z bazy Oracle");
    }

    public void generateOracleHTMLreport (String table, Connection conn){
        System.out.println("Drukujemy raport HTML z tabeli " + table + " z bazy Oracle");
    }
}
