package sample;

public class TimetoEquality {
	public class MinimumTimeToMakeArrayEqual {
		
		 public static void main(String[] args) {
		        int[] A = {2, 4, 1, 3, 2};
		        
		        int maxElement = A[0];
		        int totalTime = 0;
		        
		        for (int i = 1; i < A.length; i++) {
		            if (A[i] > maxElement) {
		                maxElement = A[i];
		            }
		        }
		        
		        for (int i = 0; i < A.length; i++) {
		            totalTime += maxElement - A[i];
		        }
		        
		        System.out.println("Minimum time in seconds: " + totalTime);
		    }
		}

}
