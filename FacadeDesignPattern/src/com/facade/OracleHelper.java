package com.facade;

import java.sql.Connection;

public class OracleHelper {
    
    public static Connection getOracleDBConnection(){
        System.out.println("Oracle conection established");
        return null;
    }
    
    public void generateOraclePDFReport(String tableName, Connection con){
        System.out.println(" Oracle PDF Report Generated");
    }
    
    public void generateOracleHTMLReport(String tableName, Connection con){
        System.out.println(" Oracle HTML Report Generated");
    }
}