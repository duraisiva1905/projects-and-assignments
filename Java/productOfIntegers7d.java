/*Implement a program to calculate the product of three positive integer values. However, if one of the integers is 7, consider only the values to the right of 7 for calculation. If 7 is the last integer, then display -1.
Only one of the three values can be 7.*/
import java.util.Scanner;
public class productOfIntegers7d {
    public static void main(String args[]) {
    int a;
    int b;
    int c;
    Scanner s=new Scanner(System.in);
    a=s.nextInt();
    b=s.nextInt();
    c=s.nextInt();
    System.out.println("The entered Numbers are");
    System.out.println("a ="+" "+a+"   "+"b= "+" "+b+"   "+"c ="+" "+c);
    if(c==7)
    {
        System.out.println("The Answer is "+-1);
    }
    else if(b==7)
    {
        System.out.println("The Answer is "+ c);
    }
    else if(a==7)
    {
        System.out.println("The Answer is "+ b*c);
    }
    else
    {
        System.out.println("The Answer is "+ a*b*c);
    }
    }
}