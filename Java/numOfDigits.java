import java.util.Scanner;
public class numOfDigits {
    public static void main(String args[]) {
     Scanner s =new Scanner(System.in);
     System.out.println("enter a number");
    int n=s.nextInt();
     int c=0;
     while(n!=0)
     {
         int t=n%10;
         n=n/10;
         c=c+1;
     }
     System.out.println("the number of digits of the number is: "+c);
    }
}