package DB;

import java.util.Scanner;

public class DBMain {

	public static void main(String[] args){
		
		
		Scanner sc = new Scanner(System.in);
		String input=sc.nextLine();
		AuthenticationService.authentication(input);
		sc.close();

	}

}
