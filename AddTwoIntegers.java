import java.util.Scanner;
public class AddTwoIntegers{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int a,b;
		System.out.print("Enter first number : ");
		a=sc.nextInt();
		System.out.print("Enter second number : ");
		b=sc.nextInt();
		System.out.println("The sum of " +a+ " and " +b+ " is :" +(a+b));
	}
}