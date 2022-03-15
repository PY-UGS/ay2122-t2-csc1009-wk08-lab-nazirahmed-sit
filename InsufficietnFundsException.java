public class InsufficietnFundsException extends Exception {

    private double amount;
    public InsufficietnFundsException(double amount){
        this.amount = amount;
    }
    public double getAmount(){
        return this.amount;
    }
    
}
