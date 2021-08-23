package arraysCode;

public class PrimeNumber {

	public static void main(String[] args) {
		PrimeNumber pm = new PrimeNumber();
		int num = 8;
		//boolean flag = true;
		if(pm.isPrime(num) == 0) {
			System.out.println("Its prime");
		}else {
			System.out.println("Not prime");
		}
		

	}

	private int isPrime(int num) {
		int count =0;
		if(num==1 || num==0) return 1;
		for(int i=2; i< num/2; i++) {
		if(num%i==0) {
			count++;
			break;
		}
		
		
		
		}
		
		return count;
		
	}
}


