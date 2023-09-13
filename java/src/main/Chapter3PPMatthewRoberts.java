package SchoolProgramming2;

import java.util.Random;

public class Chapter3PPMatthewRoberts {

	public static void main(String[] args) {
		String firstName, lastName, usernameLast;
		char usernameFirst;
		int age, num2;
		double num1;
		Random rand = new Random();
		int upperBoundForRandomNumberToAddToAge;
		firstName = InputFromUser.inputFromUserAsString("What is your first name: ");
		
		lastName = InputFromUser.inputFromUserAsString("What is your last name: ");
	
		age = InputFromUser.inputFromUserInt("What is your age: ");
		
		upperBoundForRandomNumberToAddToAge = InputFromUser.inputFromUserInt("Give positive upper bound for the number to be added to age.");
		num1 = Math.sqrt(age) / 2;
		num2 = (int) Math.floor(num1);

		usernameFirst = firstName.charAt(num2);

		usernameLast = lastName.substring(lastName.length() - 4);

		usernameLast = usernameLast.toLowerCase();// making the username lowercase

		usernameLast = (usernameLast + (rand.nextInt(upperBoundForRandomNumberToAddToAge) + age)); // should be between the age of the user and 99

		System.out.println("Your full name is: ".concat(firstName).concat(" ").concat(lastName)); // Prints out the full name of the user
		System.out.println("Your age is: ".concat(String.valueOf(age))); // Prints the age of the user
		System.out.print("Your username is: ".concat(String.valueOf(usernameFirst)).concat(usernameLast));// display username with random number
																				// attached

		// System.out.println("age sqrt is: " + num2);

	}

}