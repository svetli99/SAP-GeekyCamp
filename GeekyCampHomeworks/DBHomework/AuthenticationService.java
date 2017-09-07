package DB;

public class AuthenticationService {
	
	public static void authentication(String input){
		
		String[] readInput=input.split(" ");
		
		switch (readInput[0]){
		case "get":
			if(readInput.length ==4){
				MYSQLService.selectBy(readInput[1],readInput[2],readInput[3]);
			}else if(readInput.length==3){
				MYSQLService.selectAll(readInput[2]);
			}
			break;
		case "delete":
			MYSQLService.delete(readInput[1],readInput[2],readInput[3]);
			break;
		case "create":
			switch(readInput[1]){
			case "student":
				MYSQLService.createStudent(readInput[2],readInput[3],readInput[4]);
				break;
			case "department":
				MYSQLService.createDepartment(readInput[2],readInput[3],readInput[4]);
				break;
			case "course":
				MYSQLService.createCourse(readInput[2],readInput[3],readInput[4]);
				break;
			default:
				System.out.println("invalid input");
				break;
			}
			break;
		default:
			System.out.println("invalid input");
			break;
		}
	
		
		
	}

}
