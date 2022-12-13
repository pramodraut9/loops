import java.util.*;

public class Mul {
    public static void main(String[] args) {

        System.out.println("Enter the number :");
        Scanner s1 = new Scanner(System.in);
        
        int num= s1.nextInt();

        System.out.println("The multiplication Table is :"+num);
        for(int i=1;i<11; i++){
            System.out.println(num + "*"+i+ "="+num*i);
        }
         
         
    }
    
}
