import java.util.*;

public class Powerdemo {
    public static void main(String[] args) {
        int base=0;
        int power=0;
        int res=1;
    
    Scanner s=new Scanner(System.in);
    System.out.print("Enter the base :");
    base=s.nextInt();
    System.out.print("Enter the power :");
    power=s.nextInt();
    for(int i=1; i<=power; i++){
        res *= base;
    }
    System.out.println("The result is :"+res);
    }
}




