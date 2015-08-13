/*****************************************************************************
 * Author:	Hetal Sakaria
 * Class: 	CS 356
 * Date: 	Aug 13, 2015
 * Project: 1
 * 			Simulate iVoteService.
 * 			Configure Question Type and Answer from the Candidiate Class.
 * 			StudentID class randomly generates unique StudentID.
 * 			Student class randomly generates student's answer according to 
 * 			question type.
 * 			All answers submited to iVoteService class and then it Display.
 ******************************************************************************/
public class SimulationDriver{

	public static void main(String[] args)  {
		
		System.out.println("\tHetal Sakaria \n");
		System.out.println("\t  CS356\n ");
		System.out.println("\t----------------------------------\n");

		
		int totalStudent = 0;
		int noOfStudents;
		char studentAns;
		
		StudentID studentId = new StudentID();
		Student student = new Student();
		IVoteService iVote = new IVoteService();
		Candidate candidate = new Candidate();

		noOfStudents = student.generateNoOfStudents();

		/*****************************************************************************
		 * Candidate class generate question type
		 * If random number =1, it will be multiple choice
		 * If random number = 2, it will be boolean choice
		 ******************************************************************************/		

		if(candidate.questionType() == 1){
			
			System.out.println("\tQuestion Type:  Multiple Choice  ");
			
			if(candidate.questionType()==1){
			
				System.out.println("\t\t"+ "(only one aswer)");
				String candidateans = candidate.multipleChoiceAnswer()+"";
	
				
				candidate.aKey.add(("\t"+ candidateans));
				System.out.println("\tAns:  " + candidate.aKey.get(0) + "\n");
				DisplayTitle();
				
				/***************************************************************************
				 * pass candidate answer to iVoteService for configuration
				 * to get the final statistic.
				 **************************************************************************/
				
				while(totalStudent< noOfStudents){
					
						String stID = studentId.studentID();
						studentAns = student.multipleChoiceAnswer();
						
						Display(studentAns, stID, iVote);
						
						totalStudent++;
	
					}
				
			}
			
			/***************************************************************************
			 * question type is multiple choice with more than one answers.
			 **************************************************************************/
			
			else{
				
				System.out.println("\t\t"+"(More than one anwers)");
				System.out.print("\t\tAns: ");
				candidate.multipleLetters();
				
				DisplayTitle();
			
				while(totalStudent< noOfStudents){
					
					String stID = studentId.studentID();
					System.out.print("\t"+ stID+":  "+ "\t");
					
					student.multipleLetters();					
					totalStudent++;
					
					System.out.println();
				}	
				
			}
		}
		
		/***************************************************************************
		 * Question type is boolean.
		 **************************************************************************/
		
		else{
			
			System.out.println("\tQuestion Type: Boolean [T/F]");// + candidate.getQuesType() + "  ");
			candidate.aKey.add("\t"+ candidate.booleanAnswer());
			System.out.println("\tAns:  " + candidate.aKey.get(0) + "\n");

			DisplayTitle();
			while(totalStudent< noOfStudents){
				String stID = studentId.studentID();

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
		System.out.println("\t--------------------------------\n");

		iVote.setTotalStudentsSubmitted(totalStudent);
		
		System.out.println("\tTotal Students:  " + iVote.getTotalStudentsSubmitted());
		System.out.println("\t--------------------------------\n");

		System.out.println("\tResult:\n");

		System.out.println("\t\t"+iVote.calcuateAns() + "\n");
		System.out.println("\t"+iVote.DisplayStatistic());
		System.out.println("\t--------------------------------\n");

	}
	
	private static void DisplayTitle() {
		System.out.println();
		System.out.println("\t----------------------------------\n");
		System.out.println("\tStudentID"    +  "\tAnswer\n");
				
	}

	/****************************************************************************************
	 * Display Students' answer according to a question type.  
	 *****************************************************************************************/
	private static void Display(char studentAns, String stID, IVoteService iVote) {
		
		System.out.print("\t"+stID + "  "+"\t  "+ studentAns);
		
		/**************************************
		 * Store StudentId and his Ans to iVote
		 **************************************/
		iVote.iVote.put(stID, studentAns +"");
		
		System.out.println("");
		
	}

}
