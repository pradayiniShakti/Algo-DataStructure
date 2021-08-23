package arraysCode;

public class PrimeNumberCount {
	static int n = 10;
	
	public static void main(String[] args) {
		PrimeNumberCount primeNumberCount = new PrimeNumberCount();
	 
	int totalCount =  primeNumberCount.getPrimeCount(n);
	System.out.println(totalCount);

	}

	private int getPrimeCount(int n) {
		boolean[] dp = new boolean[n];
		if(n<2) {
			return 0;
		}
		int count = 0;
		for(int i = 2; i<n; i++) {
			if(dp[i]==false) {
				count++;
				markAllTrue(i, dp);
			}
		}
		return count;
	}

	private static void markAllTrue(int i, boolean[] dp) {
		for(int m =2; m*i< dp.length; m++) {
			dp[m*i] = true;
		}
		
	}

}
