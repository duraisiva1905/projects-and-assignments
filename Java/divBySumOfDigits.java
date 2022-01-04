import java.util.Scanner;
public class divBySumOfDigits {
  public static void main(String[] args) {
Scanner s=new Scanner(System.in);
System.out.println("enter a number");
int n=s.nextInt();
int n1=n;
int su=0;
while(n!=0)
{
  int t=n%10;
  su=su+t;
  n=n/10;
}
if (n1%su==0)
{
  System.out.println("the given number is divisible by the sum of its digits");
}
else{
  System.out.println("the given number is not divisible by the sum of its digits");
}  
  }
}