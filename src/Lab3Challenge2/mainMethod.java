package Lab3Challenge2;

public class mainMethod {

	public static void main(String[] args) throws InvalidTestScore {
		
		
		double[] testScores = {15,10,-10,10,10};
		TestScores Test = new TestScores(testScores);
		double average = Test.averageScore();
		
		System.out.println(average);
	}

}
