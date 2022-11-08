// Swapping without taking third variable
import java.util.Scanner;
public class Swap{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int e,b;
		System.out.print("Enter the value of a: ");
		a=sc.nextInt();
		System.out.print("Enter the value of b: ");
		b=sc.nextInt();
		e=e+b;
		b=e-b;
		e=e-b;
		System.out.println("Swapped Value of a is: "+e+ '\n' + "and b is : "+ b);
	}
}
