import java.util.Scanner;
public class LargestOfThree{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int a, b, c;
		System.out.print("Enter 1st Integer: ");
		a=sc.nextInt();
		System.out.print("Enter 2nd Integer: ");
		b=sc.nextInt();
		System.out.print("Enter 3rd Integer: ");
		c=sc.nextInt();
		if (a>b){
			if(a>c)
				System.out.println(a+" is the largest integer among the given.");
			else
				System.out.println(c+" is the largest integer among the given.");
		}
		else{
			if(b>c)
				System.out.println(b+" is the largest integer among the given.");
			else
				System.out.println(c+" is the largest integer among the given.");
		}
	}
}	