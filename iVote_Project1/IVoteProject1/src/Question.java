import java.util.Hashtable;
import java.util.Map;

public class Question {
	private String question;
	
	
	private String getQuestion() {
		return question;
	}

	private void setQuestion(String question) {
		this.question = question;
	}

	Map<Integer, String> quesAns =new Hashtable<Integer,String>();


	private Map<Integer, String> getQuesAns() {
		return quesAns;
	}


	private void setQuesAns(Map<Integer, String> quesAns) {

		
		this.quesAns = quesAns;
	}

	
	
	private String printTable(){
		
		//System.out.println(quesAns.get(3));
		return question;
	}

	

}
