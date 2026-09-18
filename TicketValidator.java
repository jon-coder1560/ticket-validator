import java.util.Scanner;

public class TicketValidator {

	public static void main(String[] args) {
		 int price = 12;
		 int ticket;
		 int attempts = 0;
		 int cost;
		 
		 
		 Scanner stdin = new Scanner(System.in);
		 
		 System.out.print("How many tickets do you want (1-10): ");
		 ticket = stdin.nextInt();
		 
		 while (ticket < 1 || ticket > 10) {
			 System.out.println("Invalid Input");
			 System.out.print("How many tickets do you want (1-10): ");
			 ticket = stdin.nextInt();
			 
			 attempts++;
		 }
		 
		 cost = price * ticket;
		 
		 System.out.println("\nTotal number of tickets: " + ticket);
		 System.out.println("Total cost of tickets: $" + cost);
		 System.out.println("Number of invalid attempts: " + attempts);
		 

	}

}
