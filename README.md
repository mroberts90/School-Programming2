# School-Programming2
The second programming problem for my class

package Chapter3PPMatthewRoberts;
/* Matthew Roberts
 * 10/08/2019
 * Project 3
 * Extra Credit: 5 points if accomplished and submitted on the 8th of October
 * Project Description:  
 * 1) Use the sqrt method of the Math class to get the square root of the user’s age.
 * 2) Get the last four characters (assuming the last name has at least five characters) of the last name.
 * 3) Generate a random number between the user’s age and 99 inclusive.
 * 4)Make a user name using the character from first name, the last four characters of the last name and the
random number.
5) The user name must be all in lower case.
6) Display a message to inform the user of his user name.

 */
import java.util.Scanner;
import java.util.Random;
public class Chapter3PPMatthewRoberts {

	public static void main(String[] args) {
		String firstName, lastName, usernameLast;
		char usernameFirst;
		int age, num2;
		double num1;
		Random rand = new Random ();
		Scanner scan = new Scanner(System.in);
		
		
		System.out.print("What is your first name: ");
		firstName = scan.nextLine();
	
		System.out.print("What is your last name: ");
		lastName = scan.nextLine();
		
		System.out.println("What is your age: ");
		age = scan.nextInt();
		
		
		num1 = Math.sqrt(age)/2;
		num2 = (int)Math.floor(num1);
		
		usernameFirst = firstName.charAt(num2);
		
		usernameLast =  lastName.substring(lastName.length() - 4);
		
		
		
		
		usernameLast = usernameLast.toLowerCase();//making the username lowercase
		
		
		usernameLast = (usernameLast + (rand.nextInt(100) + age )); //should be between the age of the user and 99
		
		System.out.println("Your full name is: " + firstName + " " + lastName); //Prints out the full name of the user
		System.out.println("Your age is: " + age); //Prints the age of the user
		System.out.print("Your username is: " + usernameFirst +   usernameLast);//display username with random number attached
		
		//System.out.println("age sqrt is: " + num2);

	}

}
