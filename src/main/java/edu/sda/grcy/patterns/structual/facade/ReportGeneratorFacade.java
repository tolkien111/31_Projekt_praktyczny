package edu.sda.grcy.patterns.structual.facade;

import java.sql.Connection;

public class ReportGeneratorFacade {

    public static void generateReport(DBType dbType, ReportType reportType, String table) {
        Connection conn;

        switch (dbType) {
            case MYSQL:
                conn = MySQLReportGenerator.getMySQLConnction();
                MySQLReportGenerator reportGenerator = new MySQLReportGenerator();
                switch (reportType) {
                    case HTML:
                        reportGenerator.generateMySQLHTMLreport(table, conn);
                    case PDF:
                        reportGenerator.generateMySQLPDFreport(table, conn);
                }
            case ORACLE:
                conn = OracleReportGenerator.getOracleConnction();
                OracleReportGenerator reportGenerator1 = new OracleReportGenerator();
                switch (reportType) {
                    case HTML:
                        reportGenerator1.generateOracleHTMLreport(table, conn);
                    case PDF:
                        reportGenerator1.generateOraclePDFreport(table, conn);
                }
                break;
        }
    }

    public enum DBType {
        MYSQL, ORACLE
    }

    public enum ReportType {
        HTML, PDF
    }
}
