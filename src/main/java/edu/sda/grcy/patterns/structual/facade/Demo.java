package edu.sda.grcy.patterns.structual.facade;

import java.sql.Connection;

public class Demo {
    public static void main(String[] args) {
        String table = "Employee";

        //generujemy raport PDF z tabeli z bazy Oracle
        Connection connection = OracleReportGenerator.getOracleConnction();
        OracleReportGenerator oracleReportGenerator = new OracleReportGenerator();
        oracleReportGenerator.generateOraclePDFreport(table, connection);

        //a teraz z MySQL report HTML
        Connection connection1 = MySQLReportGenerator.getMySQLConnction();
        MySQLReportGenerator mySQLReportGenerator = new MySQLReportGenerator();
        mySQLReportGenerator.generateMySQLHTMLreport(table,connection1);

        /**
         * Problem: klient (aplikacja która używa generatora raportów)
         * musi wykonać kilka kroków zanim dostanie to o co naprawdę jej chodzi
         */

        ReportGeneratorFacade.generateReport(ReportGeneratorFacade.DBType.ORACLE,
                ReportGeneratorFacade.ReportType.HTML,
                table);

        ReportGeneratorFacade.generateReport(ReportGeneratorFacade.DBType.MYSQL,
                ReportGeneratorFacade.ReportType.PDF,
                table);
    }
}
