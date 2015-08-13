/***************************************************************************
 * All the answers get submitted to IVoteService.
 * Store students' answer in a studentsVoted Hashtable.The key is studentId
 * and the value is Answer.
 * IVoteService then calculate the statistics according to given question 
 * type.
 * It also DisplayStatistic and print the hashtable.
 * 
 ****************************************************************************/
import java.text.DecimalFormat;
import java.util.Enumeration;
import java.util.Hashtable;

public class IVoteService {
	
	private int totalStudentsSubmitted;
	private int totalA=0;
	private int totalB=0;
	private int totalC=0;
	private int totalD=0;
	private int totalT=0;
	private int totalF=0;
	private String candidateans;
	
	Hashtable<String,String> iVote = new Hashtable<String, String>();
	
	Hashtable<String, Integer> calculatedVote = new Hashtable<String, Integer>();

	public int getTotalStudentsSubmitted() {
		return totalStudentsSubmitted;
	}
	public void setTotalStudentsSubmitted(int totalStudentsSubmitted) {
		this.totalStudentsSubmitted = totalStudentsSubmitted;
	}
	public Hashtable<String, Integer> getStudentsVoted() {
		return calculatedVote;
	}
	public void setStudentsVoted(Hashtable<String, Integer> studentsVoted) {
		this.calculatedVote = studentsVoted;
	}

	/**************************************************************************
	 * Print iVote Hashtable.
	 ***************************************************************************/

	public void PrintTable(){
		System.out.println(iVote);
	}
	
	/**************************************************************************
	 * Calculate answer according to question type and stores into studentsVoted
	 * Hashtable.
	 ***************************************************************************/
	
	public Hashtable<String,Integer> calcuateAns(){
		
		Enumeration<String> studentIDKey = iVote.keys();
		
		while(studentIDKey.hasMoreElements()){
			
			String key = studentIDKey.nextElement();
			
			String answere = iVote.get(key);
			
				if(answere.equals("A")){
					totalA++;
					calculatedVote.put("A", totalA);
				}
				if(answere.equals("B")){
					totalB++;
					calculatedVote.put("B", totalB);

				}
				if(answere.equals("C")){
					totalC++;
					calculatedVote.put("C", totalC);

				}
				if(answere.equals("D")){
					totalD++;
					calculatedVote.put("D", totalD);

				}
				if(answere.equals("T")){
					totalT++;
					calculatedVote.put("T", totalT);

				}
				if(answere.equals("F")){
					totalF++;
					calculatedVote.put("F", totalF);

				}
			
		}
		return calculatedVote;

	}
	
	/**************************************************************************
	 * Print iVote Hashtable.
	 ***************************************************************************/
	
	public String DisplayStatistic(){
		
		 DecimalFormat df = new DecimalFormat("#.##");

		
		Enumeration<String> studentsAnswered = calculatedVote.keys();

		while(studentsAnswered.hasMoreElements()){
			
			String key = studentsAnswered.nextElement();
			Integer eachVotesValues = calculatedVote.get(key);
			
		
			
			System.out.println("\t\t"+key + ":  " 
					+ df.format(((double)eachVotesValues/(double)totalStudentsSubmitted)*100)
					+ "%");
			}
		
		return "";
		
	}
	
	public void ConfigureStatistic(){
		System.out.println("Cadidate Ans: "+ candidateans);
		
	}
	public String getCandidateans() {
		return candidateans;
	}
	public void setCandidateans(String candidateans) {
		this.candidateans = candidateans;
	}

}
