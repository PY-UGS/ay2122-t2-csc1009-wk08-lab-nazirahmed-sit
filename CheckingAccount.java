public class CheckingAccount {

    private double balance;
    private String AcctNum;

    public CheckingAccount(){
        this.balance = 0;
        this.AcctNum= "123123";
    }

    public void deposit(double money){
        this.balance += money;
        System.out.println("Balance after deposit is: $" + this.getbalance());
    }
    public void withdraw(double money) throws InsufficietnFundsException{

        InsufficietnFundsException checker = new InsufficietnFundsException(money); //Might not be necessary
        if(checker.getAmount() > this.balance){
            System.out.println("Sorry, but your account is short by: $" + (money-this.balance));
            throw new InsufficietnFundsException(money);
        }
        else{
            this.balance -= money;
            System.out.println("Balance after withdrawl is: " + this.getbalance());
        }
        
    }
    public double getbalance(){
        return this.balance;
    }
    public String getAcctno(){
        return this.AcctNum;
    }
    
}
