import java.util.Scanner;
public class splitNumToDigits {
    public static void main(String args[]) {
   try{  Scanner s =new Scanner(System.in);
     System.out.println("enter a number");
   long n=s.nextLong();
       int i=0;
        int c=0;
        long[] a=new long[20];
     while(n!=0)
     {  
        long t=n%10;
          a[i]=t;
         i++;
         c++;
         n=n/10;
         
     }
     System.out.println("The digits are:");
     c=c-1;
     for(i=c;i>=0;c--)
     {
          
         System.out.println(a[c]);
     }
   }
   catch(ArrayIndexOutOfBoundsException e)
   {
       System.out.println("");
   }
     
    }
}