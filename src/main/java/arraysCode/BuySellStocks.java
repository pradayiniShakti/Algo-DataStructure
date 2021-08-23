package arraysCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class BuySellStocks {

	public static void main(String[] args) {
		BuySellStocks buySellStocks = new BuySellStocks();
		int[] prices = {7,1,5,3,6,4,10};
		int maxProfit = buySellStocks.getTheMaxProfit(prices);
		System.out.println("The max profit is "+ maxProfit);
		
		int[] getIndex = buySellStocks.getTheIndexes(maxProfit,prices );
		System.out.println(Arrays.toString(getIndex));
	}
/////gives the required index of the two days where the profit is max
	private int[] getTheIndexes(int maxProfit, int[] prices) {
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		
		for(int i = prices.length-1; i >=0 ; i--) {
			int component = maxProfit + prices[i];
			if(map.containsKey(component)) {
				return new int[] {map.get(component), i};
			}else {
				map.put(prices[i], i);
			}
		}
		return null;
	}

	private int getTheMaxProfit(int[] prices) {
		int maxProfit = 0;
		int minProfit = Integer.MAX_VALUE;
		
		for(int i =0; i< prices.length; i++) {
			if(prices[i]< minProfit) minProfit = prices[i];
			else if(prices[i]> minProfit) maxProfit = Math.max(prices[i]-minProfit, maxProfit);
		}
		return maxProfit;
	}
}
