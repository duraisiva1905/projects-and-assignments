/*Implement a program to find the number of rabbits and chickens in a farm. Given the number of heads and legs of the chickens and rabbits in a farm, identify and display the number of chickens and rabbits in the farm.
If the given input cannot make a valid number of rabbits and chickens, then display an appropriate message.*/
import java.util.Scanner;
public class chickenrabbit {
    public static void main(String args[]) {
Scanner s=new Scanner(System.in);
System.out.println("Enter the number of heads:");
int h=s.nextInt();
System.out.println("Enter the number of legs:");
int l=s.nextInt();
int c=0;
int r=0;
if(h%2!=0 && l%2!=0)
{
    System.out.println("Numbers of Chickens and rabbits cannot be found......");
    System.out.println("please enter the valid number of heads and legs");
}
else
{
while(l!=0)
{
    c=c+2;
    l=l-4;
    r=r+1;
    l=l-4;
}
System.out.println("The number of Chickens are "+c+" and the number of Rabbits are "+r);
}

    }
}