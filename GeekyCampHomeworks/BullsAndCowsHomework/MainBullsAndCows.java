package BullsAndCows;

import java.util.ArrayList;
import java.util.Scanner;

public class MainBullsAndCows {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> number = GenerateNumber.generateRandom();
		boolean turn = false;

		do {
			String input = sc.nextLine();
			if (input.split(" ").length == 1) {
				if (input.length() == 4) {
					if (input.matches("[0-9]+")) {
						if (differnt(input)) {
							turn = CheckBullsAndCows.check(number, input);
						}else {
							System.out.println("Wrong number");
						}
					} else {
						System.out.println("Invalid input");
					}
				} else {
					System.err.println("Input too long  !");
				}
			} else {
				System.out.println("Invali inputsf");
			}

		} while (!turn);
		System.out.println("Congratulations");
		sc.close();
	}

	private static boolean differnt(String assum) {
		boolean check = true;
		for (int i = 0; i < assum.length() - 1; i++) {
			for (int k = i + 1; k < assum.length(); k++) {
				if (assum.charAt(i) == assum.charAt(k)) {
					check = false;
				}
			}
		}
		return check;
	}

}
