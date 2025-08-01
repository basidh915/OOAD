import java.util.Scanner;

public class Welcome{
	public static void main(String[] args){
	
	String fname;
	String lname;
	
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Enter yout First Name");
	fname = scanner.nextLine();
	
	System.out.println("Enter yout Last Name");
	lname = scanner.nextLine();
	
	System.out.println("Welcome to the Second Year " +fname+" " +lname);
	
	scanner.close();
	}
}	
	