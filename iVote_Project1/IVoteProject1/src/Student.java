

/***************************************************************************
 * Generate number of students between 18 to 30.
 * Generate Student's answer randomly depending on the question type.
 * Eg. For multiple choice question, it generates answer from A to D
 * 	   if question type is boolean, it generates answer T and F.
 * 
 ****************************************************************************/

public class Student extends Candidate{
	
	private String studentID;
	private char studentAns;
	private char noOfStudents;


	public char getStudentAns() {
		return studentAns;
	}

	public void setStudentAns(char studentAns) {
		this.studentAns = studentAns;
	}

	public String getStudentID() {
		return studentID;
	}
	
	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}
	public char getNoOfStudents() {
		return noOfStudents;
	}
	public void setNoOfStudents(char noOfstudents) {
		this.noOfStudents = noOfstudents;
	}

		
	/**************************************************************************
	 Generate Random number of students from 18 to 30.
	***************************************************************************/

	public char generateNoOfStudents(){
		int min =18;
		int max = 30;
		int ans = random.nextInt(max-min +1) + min;
		noOfStudents = (char)ans;
			
		return noOfStudents;
	}
	
	/**************************************************************************
	 Generate Random number from 65(A) to 68(D)
	***************************************************************************/
	@Override
	public char multipleChoiceAnswer(){
		int min = 65;
		int max = 68;
		int ans = random.nextInt(max-min +1) + min;
		studentAns = (char)ans;
			
		return studentAns;
	}
	/**************************************************************************
	 This function returns the list of multiple answers.
	 for example: A,B or A,B,D etc.
	 This function call when question type is multiple choice that has more than
	 one answers.
	***************************************************************************/
	@Override	
	public  void multipleLetters(){
		
		String[] array = {"A","B","C","D"};
			
			
			for(int i=0; i<4; i++){
				int randomNo = random.nextInt(5);
				if (randomNo == 1 ||randomNo == 4 ){
					array[i] = " ";
				}
				
			}
					
			for(int i=0; i<array.length; i++){
				System.out.print(array[i]+ " ");
				
			}
	}

	/**************************************************************************
	 Generate Random number 1 for True (T = 84) and 2 for False (F = 70).
	***************************************************************************/
	@Override
	public char booleanAnswer(){
	
		int ans = random.nextInt(2)+1;
		if(ans == 1){
			studentAns = 84;
		}
		else
			studentAns = 70;
		
		return studentAns;
	}

	
}
