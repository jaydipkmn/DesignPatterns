package com.facade;

import java.sql.Connection;

public class MySqlHelper {
    
    public static Connection getMySqlDBConnection(){
        System.out.println("MYSQL conection established");
        return null;
    }
    
    public void generateMySqlPDFReport(String tableName, Connection con){
        System.out.println("My SQL PDF Report Generated");
    }
    
    public void generateMySqlHTMLReport(String tableName, Connection con){
        System.out.println("My SQL HTML Report Generated");
    }
}