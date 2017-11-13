package accounts;

import javax.swing.JOptionPane;
import java.util.*;

public class salesPerson{
    //Variable Declaration
    String name;
    double paperSales;
    double servicesSales;
    double suppliesSales;
    public int userId;
    double allSales = 0;
    HashMap<String,Double> map = new HashMap();
    Paper paper = new Paper();
    Services service = new Services();
    Supplies supplies = new Supplies();
    
    //Constructors
    salesPerson(){
    };
    
    salesPerson(String name){
        
    }
    
    //Method Declaration
    
    //Generates paper sales for the given employee
    double getPaperSales(){
        
        
        paper.computeSales();
        paperSales = paper.totalPaper;
        return paperSales;
    }
    
    //Generates services sales for the given employee
    double getServicesSales(){
        
        
        service.computeSales();
        servicesSales = service.totalServices;
        return servicesSales;
    }
    
    //Generates supplies sales for the given employee
    double getSuppliesSales(){
        
        
        supplies.computeSales();
        suppliesSales = supplies.totalSupplies;
        return suppliesSales;
    }
    
   
    double totalSales(){
        
        double totalSales;
        totalSales = suppliesSales + servicesSales + paperSales;
        System.out.println("Total sales across all acounts to date: " + totalSales);
        allSales = allSales + totalSales;
        return totalSales;
        
    }
    
    void newSalesPerson(){
        double allSales;
        
        name = JOptionPane.showInputDialog("What is the name of the sales person?");
        paperSales = paper.computeSales();
        servicesSales = service.computeSales();
        suppliesSales = supplies.computeSales();
        allSales = totalSales();
        map.put(name, allSales);
        
    }
    
    
}
