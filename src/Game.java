import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String name, direction;
		int score = 0;
		
		System.out.println("Welcome to the game!");
		System.out.print("What's your name? ");
		name = input.nextLine();
		System.out.println("Hello, " + name + "!");
		System.out.println("You are in a maze. Try to find the exit. ");
		
		while (true) {
			System.out.print("Which direction do you want to go (north, south, east, or west? ");
			direction = input.nextLine();
			
			if (direction.equals("north")) {
				System.out.println("You can't go that way!");
			} else if (direction.equals("south")) {
				System.out.println("You can't go that way!");
			} else if (direction.equals("east")) {
				System.out.println("You found a treasure! + 10 points!");
				score += 10;
			} else if (direction.equals("west")) {
				System.out.println("You found the exit! Congratulations!");
				break;
			} else {
				System.out.println("Invalid direction!");
			}
		}

		System.out.println("Your final score is " + score + ".");
		System.out.println("Thanks for playing!");
	}

}
