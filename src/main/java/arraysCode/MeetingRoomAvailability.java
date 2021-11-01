package arraysCode;

import java.util.Arrays;
import java.util.Comparator;

public class MeetingRoomAvailability {

	public static void main(String[] args) {
		int[][] interval = {{0,30},{5,10},{15,20}};
		int result = getMinMeetingRoom(interval);
		
		System.out.println(result);
	}

	private static int getMinMeetingRoom(int[][] interval) {
		if(interval.length==0) return 0;
		
		Integer[] start = new Integer[interval.length];
		Integer[] end = new Integer[interval.length];
		for(int i=0; i<interval.length; i++) {
			start[i] = interval[i][0];
			end[i] = interval[i][1];
		}
		Arrays.sort(end, new Comparator<Integer>(){

			public int compare(Integer o1, Integer o2) {
				
				return o1 - o2;
			}
			
		});
		 
		Arrays.sort(start, new Comparator<Integer>(){

			public int compare(Integer o1, Integer o2) {
				
				return o1 - o2;
			}
			
		});
		
		int startP = 0, endP = 0, usedRoom =0;
		
		while(startP<interval.length) {
			if(start[startP] >= end[endP]) {
				usedRoom = usedRoom -1;
				endP = endP+1;
			}
			usedRoom = usedRoom +1;
			startP = startP+1;
			
			
		}
		
		return usedRoom;
	}

}
