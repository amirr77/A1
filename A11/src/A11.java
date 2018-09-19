import java.util.Scanner;

public class A11
{
	public static void main(String[] args)

	{
		double amount;
        double numberOfTwentyDollarNotes;
		double numberOfTenDollarNotes;
		double numberOfFiveDollarNotes;
		double numberOftoonies;
		double numberOfloonies;
		double numberOfquarters;
		double numberOfdimes;
		double calc_temp;	
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter amount: ");
		
		
		amount = scan.nextDouble();
		calc_temp = amount;
		System.out.println("The amount entered is: " + amount);
		
		numberOfTwentyDollarNotes = (int) (amount / 20);
		calc_temp = calc_temp - ( numberOfTwentyDollarNotes * 20);
		
		System.out.println(numberOfTwentyDollarNotes + " Twenty dollar notes");			
		System.out.println("Remaining amount is -> " + calc_temp);			

		
		numberOfTenDollarNotes = (int) (amount % 20) /10;
		System.out.println(numberOfTenDollarNotes + " Ten dollar notes");
		calc_temp = calc_temp - ( numberOfTenDollarNotes * 10 );
		System.out.println("Remaining amount is -> " + calc_temp);
		
	
		numberOfFiveDollarNotes = (int) (amount % 4.5 ) ;
		System.out.println(numberOfFiveDollarNotes + " Five dollar notes");
		calc_temp = calc_temp - ( numberOfTenDollarNotes * 5 );
		System.out.println("Remaining amount is -> " + calc_temp);
		
		
		numberOftoonies = (int) (amount % 2) ;
		System.out.println(numberOftoonies + " Toonies");
		calc_temp = calc_temp - ( numberOfFiveDollarNotes * 2 );
		System.out.println("Remaining amount is -> " + calc_temp);
		
		
		numberOfloonies = (int) (amount %1.25 );
		System.out.println(numberOfloonies + " Loonies");
		calc_temp = calc_temp - ( numberOfTenDollarNotes * 1 );
		System.out.println("Remaining amount is -> " + calc_temp);
		
		
		
		
//		numberOfquarters = (int) (amount);
//		System.out.println(numberOfquarters + " Quarters");
//		calc_temp = calc_temp - ( numberOf)
		
		
		
		
		
		
		
		
			
		
	
		
		
		
		
		
	}

}