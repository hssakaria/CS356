import java.util.HashSet;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class Student extends Candidate implements RandomGenerator{
	
	
	private String studentID;
	private char studentAns;
	private char noOfStudents;
	
	Set<String> studentId = new HashSet<String>();
	
	
	Map<String, String> studentAnsTable = new Hashtable<String, String>();
	/**
	 * @return the studentAns
	 */
	public char getStudentAns() {
		return studentAns;
	}
	/**
	 * @param studentAns the studentAns to set
	 */
	public void setStudentAns(char studentAns) {
		this.studentAns = studentAns;
	}
	/**
	 * @return the studentID
	 */
	public String getStudentID() {
		return studentID;
	}
	/**
	 * @param studentID the studentID to set
	 */
	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}
	public char getNoOfStudents() {
		return noOfStudents;
	}
	public void setNoOfStudents(char noOfstudents) {
		this.noOfStudents = noOfstudents;
	}

	public Set<String> StudentIDs(){
		studentId.add(studentID);
		
		return studentId;
	}
		
//	
//	public void printset(){
//		Iterator iter = studentId.iterator();
//		while(iter.hasNext()){
//			System.out.println(iter.next());
//
//		}
	/**************************************************************************
	 Generate Random number from 65(A) to 68(D)
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
