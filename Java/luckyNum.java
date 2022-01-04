import java.util.Scanner;
public class luckyNum {
  public static void main(String[] args) {
Scanner s=new Scanner(System.in);
System.out.println("enter a numbers");
int n=s.nextInt();
int i=0;
int su=0;
while(n!=0)
{
  int t=n%10;
  i++;
  if(i%2==0)
  {
     su=su+(t*t);
  }
  n=n/10;
}
if(su%9!=0)
{
    System.out.println("the given number is a lucky number");
}
else
{
    System.out.println("the given number is not a lucky number");
}
}
}