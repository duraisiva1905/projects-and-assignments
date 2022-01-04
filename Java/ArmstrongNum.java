import java.util.Scanner;
public class ArmstrongNum {
  public static void main(String[] args) {
Scanner s=new Scanner(System.in);
System.out.println("enter a numbers");
int n=s.nextInt();
int n1=n;
int n2=n;
int i;
while(n!=0)
{
  int t=n%10;
  i++;
  n=n/10;
}
int arm=0;
while(n2!=0)
{
  int t=n2%10;
arm=arm+math.pow(int t,int i);
  n2=n2/10;
}

if (n1==arm)
{
  System.out.println(n1+" "+"is a armstring number");
}
else{
  System.out.println(n1+" "+"is not a armstring number");
}  
  }
}