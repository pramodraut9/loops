

import java.util.Scanner;

public class Palindrome
{
    public static void main(String[] args)
    {
        Scanner s  = new Scanner(System.in);
     
        int number;
        int reverse = 0;
        
        System.out.print("Enter the number ");
        number = s.nextInt();
        
        int temp = number;
        int remainder = 0;
        
        while(temp>0)
        {
	    remainder = temp % 10;  //gives the qoutient
	    reverse = reverse * 10 + remainder;
            temp /= 10; //gives the remainder
        }

        System.out.println("Reverse of " + number + " is " + reverse);
    }
}
