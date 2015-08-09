import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import java.util.function.Consumer;

/***********************************
 * Generate Unique Studend ID
 * 
 * @author hetu
 *
 ***********************************/


public class StudentID {
	private String studentID;
	private Integer randomNo;
	private Integer randomInitial;
	
	Set<String> set = new HashSet<String>();
	Random random = new Random();
	
	
	public String getStudentID() {
		return studentID;
	}


	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}


	
	public String studentID() {
		
		char initial1, initial2;
	
		randomNo = 10000 + random.nextInt(20000); // generate 5 digits no
		
		randomChar();
		initial1 = (char)randomInitial.intValue();
		randomChar();
		initial2 = (char)randomInitial.intValue();
		
		studentID =initial1+ "" +initial2+ randomNo.toString();
		
		set.add(studentID);
	
		return studentID;

	}

	/**************************************************************************
	 Generate Random number from 97 to 122
	***************************************************************************/

	private void randomChar() {
		int min = 97;
		int max = 122;
		randomInitial = random.nextInt(max-min +1) + min;
		
	}
	

}
