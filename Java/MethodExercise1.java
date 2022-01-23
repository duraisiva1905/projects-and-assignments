/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package method.exercise1;
import java.util.Scanner;



/**
 *
 * @author Durai Pandi
 */
class Calculator {
    double average;
    int num1;
    int num2;
    int num3;
           
public double findAverage(int num1,int  num2, int num3)
{
   average =(num1+num2+num3)/3;
    return average;
}
}
public class MethodExercise1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        	Calculator calculator = new Calculator();
		// Invoke the method findAverage of the Calculator class and display the average
		Scanner s=new Scanner(System.in);
                System.out.println("hi");		
                int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		System.out.println(calculator.findAverage(a, b, c));
    }
    
}
