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

	private Map<Integer,String> QuetionAnsTable(){
		
		
		quesAns.put(1, "A");
		quesAns.put(2, "B");
		quesAns.put(3, "T");
		quesAns.put(4, "C");
		quesAns.put(5, "A");
		quesAns.put(6, "D");
		quesAns.put(7, "T");
		return quesAns;
		
	}
	
	private String printTable(){
		
		//System.out.println(quesAns.get(3));
		return question;
	}

	

}
