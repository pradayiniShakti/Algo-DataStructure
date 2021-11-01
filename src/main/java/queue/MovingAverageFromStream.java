package queue;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;

public class MovingAverageFromStream {

	private static int[] data = {3, 1, 10, 3,5};
	 static int size =data[0];
	 int windowSum = 0;
	int count =0;
	  Deque<Integer> queue = new ArrayDeque<Integer>();
	
	public MovingAverageFromStream(int size) {
		this.size =  size;
	}
	
	public double next(int val) {
		++count;
	    // calculate the new sum by shifting the window
	    queue.add(val);
	    int tail = count > size ? (int)queue.poll() : 0;

	    windowSum = windowSum - tail + val;

	    return windowSum * 1.0 / Math.min(size, count);
		
	}
	public static void main(String[] args) {
		MovingAverageFromStream movingAverageFromStream = new MovingAverageFromStream(size);
		double[] finalRes = new double[data.length];
		//finalRes[0] = ;
		int i =0;
		//finalRes[0] = null;
		for( i =1; i<data.length; i++) {
			double res = movingAverageFromStream.next(data[i]);
			finalRes[i] = res;
			System.out.printf("%.5f", res);
			System.out.println();
		}
		
		//System.out.format("%.5f",Arrays.toString(finalRes));
	}

}
