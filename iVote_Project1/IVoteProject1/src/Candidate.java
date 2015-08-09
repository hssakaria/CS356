import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Candidate implements RandomGenerator{
	
	private int quesType;
	private String ansKey;

	List<Integer> qType = new ArrayList<Integer>();
	List<String> aKey = new ArrayList<String>();

	
	Random random = new Random();
	private char ans;

	
	public int getQuesType() {
		return quesType;
	}
	public void setQuesType(int quesType) {
		this.quesType = quesType;
		
	
	}
	public String getAnsKey() {
		return ansKey;
	}
	public void setAnsKey(String ansKey) {
		this.ansKey = ansKey;
	}

	private void quesTypeansKey(){
		qType.add(quesType);
		aKey.add(ansKey);
		
	}
	
	/**************************************************************************
	 Generate Random number 1 and 2.
	 1 = Multiplechoice QuestionType
	 2 = Boolean QuestionType
	***************************************************************************/

	public int questionType(){
		
		quesType = random.nextInt(2)+1;
		return quesType;
	}
	
	/**************************************************************************
	 Generate Random number from 65(A) to 68(D)
	***************************************************************************/
	@Override
	public char multipleChoiceAnswer(){
		int min = 65;
		int max = 68;
		int answere = random.nextInt(max-min +1) + min;
		ans = (char)answere;
			
		return ans;
	}
	/**************************************************************************
	 Generate Random number from 65(A) to 68(D)
	***************************************************************************/
	@Override
	public char booleanAnswer(){
	
		int answere = random.nextInt(2)+1;
		if(answere ==1){
			ans = 84;
		}
		else
			ans = 70;
		
			
		return ans;
	}
	

}
