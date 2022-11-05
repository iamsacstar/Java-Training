import java.util.Scanner;
public class EvenOdd{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int a;
		System.out.print("Enter the integer to check : ");
		a=sc.nextInt();
		if (a%2==0)
		System.out.println("The entered integer is Even");
		else
		System.out.println("The entered integer is Odd");
	}
}
		