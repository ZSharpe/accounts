package accounts;

import javax.swing.JOptionPane;
import java.util.*;

public class salesPerson{
    //Variable Declaration
    String firstName;
    String lastName;
    double paperSales;
    double servicesSales;
    double suppliesSales;
    public int userId;
    double totalSales;
    String preferredContact;
    String salesRegion;
    
    
    String[] array = new String[6];
    HashMap<Integer,String[]> map = new HashMap();
    Paper paper = new Paper();
    Services service = new Services();
    Supplies supplies = new Supplies();
    
    //Constructors
    salesPerson(){
    };
    
    salesPerson(String name){
        
    }
    
    
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
        
        
        totalSales = suppliesSales + servicesSales + paperSales;
        System.out.println("Total sales across all acounts to date: " + totalSales);
        return totalSales;
        
    }


    //Constructor with first / last name, ID, total sales, preferred contact, and sales region.
    public salesPerson(String firstName, String lastName, int userId, double totalSales, String preferredContact, String salesRegion) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userId = userId;
        this.totalSales = totalSales;
        this.preferredContact = preferredContact;
        this.salesRegion = salesRegion;
        
        
    }
    
    //Search Sales Person
    String[] searchSalesPerson(){
        
        int idSearch = Integer.parseInt(JOptionPane.showInputDialog("Enter the ID of the person you are looking for."));
        
        return map.get(idSearch).toString().split(firstName);
        
    }
    
    //Map new sales person to array, then HashMap
        void mapSalesPerson(String firstName, String lastName, int userId, double totalSales, String preferredContact, String salesRegion){
        this.firstName = firstName;
        this.lastName = lastName;
        this.userId = userId;
        this.totalSales = totalSales;
        this.preferredContact = preferredContact;
        this.salesRegion = salesRegion;
        
        array[0]=firstName;
        array[1]=lastName;
        array[2]=String.valueOf(userId);
        array[3]=String.valueOf(totalSales);
        array[4]=preferredContact;
        array[5]=salesRegion;
        
        
        map.put(userId,array);
             
        
    }

    
        
    @Override
    public String toString() {
        return "Person{\"salesPerson{" + "firstName=" + firstName + ", lastName=" + lastName + ", paperSales=" + paperSales + ", servicesSales=" + servicesSales + ", suppliesSales=" + suppliesSales + ", userId=" + userId + ", totalSales=" + totalSales + ", preferredContact=" + preferredContact + ", salesRegion=" + salesRegion + ", array=" + array + ", map=" + map + ", paper=" + paper + ", service=" + service + ", supplies=" + supplies + '}';
    }
    
        
        
}
