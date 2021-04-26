import java.util.Scanner;

public class MadLibs {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String color="";
		String pastTenseVerb="";
		String adjective="";
		String noun="";
		String playAgain="";
		do {
		System.out.println("Enter a color:");
		color=scan.next();
		System.out.println("Enter a past tense verb:");
		pastTenseVerb=scan.next();
		System.out.println("Enter an adjective:");
		adjective=scan.next();
		System.out.println("Enter a noun:");
		noun=scan.next();
		System.out.print("The " + color + " dragon " + pastTenseVerb + " at the " + adjective);
		System.out.println(" knight, who rode in on a sturdy, giant " + noun + ".");
		System.out.println("Would you like to play again(y/n)?");
		playAgain=scan.next();
		}while(playAgain.equalsIgnoreCase("y"));
		System.out.println("Thank you for playing! Goodbye.");
		scan.close();

	}

}
