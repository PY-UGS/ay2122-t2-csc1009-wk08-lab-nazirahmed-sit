import java.util.Scanner;

public class Lab08_qn01 {

    public static void main(String args[]){
        CircleWithException c1 = new CircleWithException();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter radius");
        int answer = input.nextInt();

        try{
            c1.setRadius(answer);
        }catch(Exception e){
            System.out.println("Exception caught");
            e.printStackTrace();
        }
        
        System.out.format("Area is: %.2f",c1.getArea());
    }
    
}
