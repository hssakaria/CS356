import java.util.Random;

public class SimulationDriver{

	public static void main(String[] args)  {
		
		int totalStudent = 0;
		int noOfStudents;
		char studentAns;
		
		StudentID studentID = new StudentID();
		Student student = new Student();
		Question queans = new Question();
		IVoteService iVote = new IVoteService();
		Candidate candidate = new Candidate();

		
		Random rand = new Random();
		
		System.out.println("Hetal Sakaria \n");
		
		System.out.println("\t CS356\n ");
		

		/****************************************************************************************
		 * Candidate class generate question type
		 * If random number =1, it will be multiple choice
		 * If random number = 2, it will be boolean choice
		 *****************************************************************************************/

		if(candidate.questionType() == 1){
			
			System.out.println(" Question Type:  Multiple Choice  ");

			candidate.aKey.add((" "+ candidate.multipleChoiceAnswer()));
			System.out.println(" Ans:  " + candidate.aKey.get(0) + "\n\n");
	
			System.out.println("----------------------------------\n");
			

			System.out.println("Choose your answere [A,B,C,or D]: \n");
			System.out.println("StudentID"    +  "\tAnswer ");
			
			noOfStudents = student.generateNoOfStudents();
			
			
			while(totalStudent< noOfStudents){
				
					String stID = studentID.studentID();
					studentAns = student.multipleChoiceAnswer();
					
					Display(studentAns, stID, iVote);
					
					totalStudent++;

				}
		
		}
		
		//boolean
		else{
			System.out.println(" Question Type: Boolean  ");// + candidate.getQuesType() + "  ");
			candidate.aKey.add(""+ candidate.booleanAnswer());
			System.out.println(" Ans:  " + candidate.aKey.get(0) + "\n\n");
			System.out.println("----------------------------------\n");

			System.out.println("Choose your answere [T/F]: \n");
			System.out.println("StudentID"    +  "\tAnswer ");
			noOfStudents = student.generateNoOfStudents();

			while(totalStudent< noOfStudents){
				String stID = studentID.studentID();

				studentAns = student.booleanAnswer();
				
				Display(studentAns, stID, iVote);

				totalStudent++;
			}
		
		}

		/****************************************************************************************
		 * iVote
		 * Submitted totalStudents voted.
		 * 
		 *****************************************************************************************/
		System.out.println("--------------------------------\n");
		//iVote Service result.
		iVote.setTotalStudentsSubmitted(totalStudent);
		System.out.println("Total Students:  " + iVote.getTotalStudentsSubmitted());

		
		System.out.println(iVote.calcuateAns());
		System.out.println(iVote.Statistic());
		System.out.println("--------------------------------\n");

	}
	/****************************************************************************************
	 * Display Students' answer according to a question type. 
	 * 
	 *****************************************************************************************/
	
	private static void Display(char studentAns, String stID, IVoteService iVote) {
		
		System.out.print(stID + "  "+"\t  "+ studentAns);
		
		/**************************************
		 * Store StudentId and his Ans to iVote
		 **************************************/
		iVote.iVote.put(stID, studentAns+"");
		
		System.out.println("");
		
	}

}
