
package accounts;

//Zach Sharpe IP 1 IT251-1704A-01

import javax.swing.JOptionPane;
import java.util.*;
import java.util.Scanner;

public class Supplies extends Accounts{
    //Private variable declarations for subclass.
    
    double totalSupplies;
    double suppliesSoldDollars;
    double booksSoldDollars;
    double apparelSoldDollars;
    
    
   //Default Constructor
    public Supplies() {
    }
    
    //Constructor taking all arguments
    public Supplies(int accountId, int totalSupplies) {
        this.accountId = accountId;
        this.totalSupplies = totalSupplies;
    }
    
    //Get calls

    public int getAccountId() {
        return accountId;
    }

    public double getTotalSupplies() {
        return totalSupplies;
    }
    
    //Set calls

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public void setTotalSupplies(int totalSupplies) {
        this.totalSupplies = totalSupplies;
    }
    
    //Print method for supplies account
    
    void printSupplies(){
        System.out.println("Your current paper acount is as follows. \n");
        System.out.println("Your account ID is: " + accountId + "\n" +
                "Total supplies: " + totalSupplies + "\n");
    }
    
    //Method to calculate total sales..
    @Override
    double computeSales(){
    double suppliesSoldDollars;
    double booksSoldDollars;
    double apparelSoldDollars;
    
    suppliesSoldDollars = Double.parseDouble(JOptionPane.showInputDialog("Please enter the amount of office supplies sold in dollars"));
    booksSoldDollars  = Double.parseDouble(JOptionPane.showInputDialog("Please enter dollars sold for books."));
    apparelSoldDollars  = Double.parseDouble(JOptionPane.showInputDialog("Please enter dollars sold for apparel."));
    totalSupplies = suppliesSoldDollars + booksSoldDollars + apparelSoldDollars;
    System.out.println("Total sales across supplies, books, and apparel equate to: $" + totalSupplies);
    return totalSupplies;
}

}
