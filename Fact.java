import java.util.Scanner;

public class Fact {
    public static void main(String[] args) {
        Scanner s1 =new Scanner(System.in);
        System.out.print("Enter the number :");
        int num;
        int fact=1;
         num = s1.nextInt();
         for(int i=1;i<=num;i++){
            fact*=i;

         }
         System.out.println("Factorial for given number is :" +fact);

        
    }
    
}
