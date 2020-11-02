import java.util.*;   

public class sumofarray {
	private static final Random RAND = new Random(42);  

	public static void main(String[] args) throws Throwable {
		int LENGTH = 10;   
		int RUNS   =   2;   

		for (int i = 1; i <= RUNS; i++) {
			int[] a = createRandomArray(LENGTH);

			
			long startTime1 = System.currentTimeMillis();
			int total = 0;
			for (int j = 1; j <= 100; j++) {
				total = sum3(a, 4);
			}
			long endTime1 = System.currentTimeMillis();
			
			int correct = sum(a);
			if (total != correct) {
				throw new RuntimeException("wrong sum: " + total + " vs. " + correct);
			}

			System.out.printf("%10d elements  =>  %6d ms \n", LENGTH, endTime1 - startTime1);
			LENGTH *= 2;   
		}
	}
	
	
	public static int sum(int[] a) {
		int result = 0;
		for (int i = 0; i < a.length; i++) {
			result += a[i];
		}
		return result;
	}}

