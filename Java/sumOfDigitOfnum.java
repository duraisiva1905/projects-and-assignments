import java.util.Scanner;
public class sumOfDigitOfnum {
    public static void main(String args[]) {
     Scanner s =new Scanner(System.in);
     System.out.println("enter a number");
    int n=s.nextInt();
     int su=0;
     while(n!=0)
     {
         int t=n%10;
        su=su+t;
         n=n/10;
     }
   System.out.println("the sum of digits of the number is:"+su);
    }
}