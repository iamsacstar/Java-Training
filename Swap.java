// Swapping without taking third variable
import java.util.Scanner;
public class Swap{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int a,b;
		System.out.print("Enter the value of a: ");
		a=sc.nextInt();
		System.out.print("Enter the value of b: ");
		b=sc.nextInt();
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("Swapped Value of a is: "+a+ '\n' + "and b is : "+ b);
	}
}