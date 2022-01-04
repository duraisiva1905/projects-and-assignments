import java.util.Scanner;
public class seednum {
  public static void main(String[] args) {
Scanner s=new Scanner(System.in);
System.out.println("enter two numbers");
int n=s.nextInt();
int ns=s.nextInt();
int n2=n;
int n1=n;
while(n!=0)
{
  int t=n%10;
  n1=n1*t;
  n=n/10;
}
if (n1==ns)
{
  System.out.println(n2+" "+"is seed of"+" "+ns);
}
else{
  System.out.println(n2+" "+"is not a seed of"+" "+ns);
}  
  }
}