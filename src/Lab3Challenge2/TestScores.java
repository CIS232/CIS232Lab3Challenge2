package Lab3Challenge2;

public class TestScores {
	public static double[] testScores;
	
	
	public TestScores(double[] testScoresInput){
		
		TestScores.testScores = testScoresInput;
		
	
	
	
	}
	
	
	public double averageScore() throws InvalidTestScore{
		 
		double sum = 0;
			for (int i = 0; testScores.length > i; i++)
				if (testScores[i] > 100 || testScores[i] < 0){
					throw new InvalidTestScore("A Test Score was found to be invalid: " + testScores[i]);
				}
				else{
					
					sum = testScores[i] + sum;
					
				}
			
			sum = sum/testScores.length;
			return sum;
			
		
	}
	
	
	
	
}
