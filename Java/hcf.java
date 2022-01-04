import java.util.Scanner;
public class hcf {
    public static void main(String args[]) {
   try{ Scanner s =new Scanner(System.in);
    System.out.println("enter the numbers");
   int a=s.nextInt();
   int b=s.nextInt();
   int r=1;
   int[] ar=new int[20];
   int i=0;
   while(r!=0)
  {
      r=a%b;
      a=b;
      b=r;
      ar[i]=r;
      i++;
   }
   i=i-1;
System.out.println("The HCF is: "+ar[i]);}
catch( ArrayIndexOutOfBoundsException e)
{
    System.out.println("");
}
    }
}
   
      