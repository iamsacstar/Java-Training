import java.util.Scanner;
public class LeapYear{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int year;
		System.out.print("Enter the Year: ");
		year=sc.nextInt();
		if(year%4==0){
			if(year%100==0)
			System.out.println("The Entered year is not a Leap Year.");
			else
			System.out.println("Entered year is a Leap Year.");
		}
		else{
			System.out.println("The Entered year is not a Leap Year.");
		}
	}
}	
