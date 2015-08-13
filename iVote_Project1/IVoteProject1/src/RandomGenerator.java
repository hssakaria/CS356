import java.util.List;
import java.util.Map;

/**************************************************************************
	Interface RandomGenerator holds two methods, which are used in Student
	and Candidate Class to generate random answers according to question
	type.
***************************************************************************/

public interface RandomGenerator {
	
	public char multipleChoiceAnswer();
	public char booleanAnswer();
	public void multipleLetters();

}
