
package accounts;

//Zach Sharpe IP 4 IT251-1704A-01

import javax.swing.*;
import java.util.*;
import java.awt.*;

 abstract public class Accounts {
     
    //Abstracted computeSales method
    abstract double computeSales();
    static Accounts accounts[] = new Accounts[33];
    
    //Totals declarations for abstract computeSales method + totalSales method
    public int accountId;
    public double totalPaper;
    double totalServices;
    double totalSupplies;
    
    
    
    public static void main(String[] args) {
    
        
        //Creating & Running methods to calculate sales for Zach, John, Rick salesPerson objects
        
        /*
        salesPerson zach = new salesPerson();
        
        zach.getPaperSales();
        zach.getServicesSales();
        zach.getSuppliesSales();
        zach.totalSales();
        
        salesPerson john = new salesPerson();
        
        john.getPaperSales();
        john.getServicesSales();
        john.getSuppliesSales();
        john.totalSales();
        
        salesPerson ricky = new salesPerson();
        
        ricky.getPaperSales();
        ricky.getServicesSales();
        ricky.getSuppliesSales();
        ricky.totalSales();
        
        //Total sales across all objects
        System.out.println(zach.totalSales()+john.totalSales()+ricky.totalSales());
        */
        
        NewJFrame frame = new NewJFrame();
        
        
    }
    
}
