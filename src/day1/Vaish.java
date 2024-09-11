package day1;
import java.util.Scanner;
public class Vaish {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Enter a string: ");
			String userInput = scanner.nextLine();

			System.out.println("You entered: " + userInput);
		} 


	}

}
