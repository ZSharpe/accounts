
package accounts;
//Zach Sharpe IP 1 IT251-1704A-01

import javax.swing.JOptionPane;


public class Paper extends Accounts{
    //Private variable declarations for subclass.
    
    private int poundsSold;
    private double pricePerPound;
    

    //Default Constructor
    public Paper() {
    }
    
    //Constructor taking all arguments
    public Paper(int accountId, int poundsSold, double pricePerPound) {
        this.accountId = accountId;
        this.poundsSold = poundsSold;
        this.pricePerPound = pricePerPound;
    }

    //Get calls

    public int getAccountId() {
        return accountId;
    }

    public int getPoundsSold() {
        return poundsSold;
    }

    public double getPricePerPound() {
        return pricePerPound;
    }
    
    //Set Calls

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public void setPoundsSold(int poundsSold) {
        this.poundsSold = poundsSold;
    }

    public void setPricePerPound(double pricePerPound) {
        this.pricePerPound = pricePerPound;
    }
    
    //Print method for paper account

    void printPaper(){
        System.out.println("Your current paper acount is as follows. \n");
        System.out.println("Your account ID is: " + accountId + "\n"
                + "Pounds sold equals: " + poundsSold + "\n"
                        + "Price per pound is: " + pricePerPound + "\n");
        
    }
    
    @Override
    double computeSales(){
    
    poundsSold  = Integer.parseInt(JOptionPane.showInputDialog("Please enter the number of pounds sold."));
    pricePerPound  = Double.parseDouble(JOptionPane.showInputDialog("Please enter the dollar amount per pound sold."));
    totalPaper = poundsSold * pricePerPound;
    System.out.println("Total paper sales equate to: $" + totalPaper);
    return totalPaper;
    
    }
    
}
