
package accounts;

//Zach Sharpe IP 1 IT251-1704A-01

import javax.swing.JOptionPane;


public class Services extends Accounts{
    
    //Private variable declarations for subclass.
    private double numberHours;
    private double ratePerHour;
    
    //Default Constructor
    public Services() {
    }
        
    //Constructor taking all arguments
    public Services(int accountId, double numberHours, double ratePerHour) {
        this.accountId = accountId;
        this.numberHours = numberHours;
        this.ratePerHour = ratePerHour;
    }

    //Get calls

    public int getAccountId() {
        return accountId;
    }

    public double getNumberHours() {
        return numberHours;
    }

    public double getRatePerHour() {
        return ratePerHour;
    }
    
    //Set calls

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public void setNumberHours(double numberHours) {
        this.numberHours = numberHours;
    }

    public void setRatePerHour(double ratePerHour) {
        this.ratePerHour = ratePerHour;
    }
    
    //Print methods
    void printServices(){
        System.out.println("Your current paper acount is as follows. \n");
        System.out.println("Your account ID is: " + accountId + "\nThe number of hours you work are: " + numberHours
                + "\nYour rate per hour is: " + ratePerHour + "\n");
    }
    
    //Method to calculate services
    @Override
    double computeSales(){
    
    numberHours  = Double.parseDouble(JOptionPane.showInputDialog("Please enter the number of hours worked."));
    ratePerHour  = Double.parseDouble(JOptionPane.showInputDialog("Please enter the dollar amount per hour."));
    totalServices = numberHours * ratePerHour;
    System.out.println("Total services equate to: $" + totalServices);
    return totalServices;
    }
}
