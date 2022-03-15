import java.util.Scanner;

public class BankDemoTest {
    public static void main(String args[]){
        CheckingAccount A1 = new CheckingAccount();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter deposit amount");
        int deposit = input.nextInt();
        System.out.println("Enter withdraw amount");
        int withdraw = input.nextInt();

        A1.deposit(deposit);
        try{
            A1.withdraw(withdraw);
        }catch(Exception e){
            e.printStackTrace();
        }

    }
    
}
