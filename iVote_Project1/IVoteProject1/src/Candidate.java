import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class Candidate implements RandomGenerator{
	
	private int quesType;
	private String ansKey;

	List<Integer> qType = new ArrayList<Integer>();
	List<String> aKey = new ArrayList<String>();
	String[] array = {"A","B","C","D"};
	Random random = new Random();
	private char ans;

	public String[] getArray() {
		return array;
	}
	
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
	
	
	/**************************************************************************
	 This function returns the list of multiple answers.
	 for example: A,B or A,B,D etc.
	 This function call when question type is multiple choice that has more than
	 one answers.
	***************************************************************************/
	
	public  void multipleLetters(){
		
		String[] array = {"A","B","C","D"};
		
		
		for(int i=0; i<4; i++){
			int randomNo = random.nextInt(4);
			if (randomNo == 1 ||randomNo == 3 ){
				array[i] = " ";
			}
			
		}
				
		for(int i=0; i<array.length; i++){
			System.out.print(array[i]+ " ");
			
		}
	}

}
