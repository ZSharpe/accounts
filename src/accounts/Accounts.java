
package accounts;

//Zach Sharpe IP 4 IT251-1704A-01

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
    
     
        
    }
    
}
