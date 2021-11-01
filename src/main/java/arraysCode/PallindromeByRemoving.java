package arraysCode;

public class PallindromeByRemoving {

	public static void main(String[] args) {
		String s = "abae";
		boolean flag = validPalindrome(s);
		
		System.out.println(flag);
	}
	

    public static boolean validPalindrome(String s) {
        int l = 0;
        int h = s.length()-1;
        while(l<h){
            if(s.charAt(l)==s.charAt(h)){
              l++;
            h--;
                
            }else{
            if(palindromeCheck(s,l+1,h)){
            	System.out.println("By removing "+l+ " "+ s.charAt(l));
                return true;
            }
              if(palindromeCheck(s,l,h-1)){
            	  System.out.println("By removing high "+h +" "+ s.charAt(h));
                  return true;
              } 
                return false;
            }
            
        }
        return true;
    }
    
     public static boolean palindromeCheck(String s, int l, int h) {
       // int l = 0;
        //int h = s.length()-1;
        while(l<h){
            if(s.charAt(l)==s.charAt(h)){
            	 l++;
                 h--;
            	//return false;
                
            }else {
            return false;}
            //l++;
           // h--;
        }
        return true;
    }

}
