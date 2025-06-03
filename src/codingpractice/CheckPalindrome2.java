package codingpractice;

public class CheckPalindrome2 {
	static String  []x= {};

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean x=true;
		String input="abcdfstwsfdcba";
		for(int i=0;i<input.length()/2;i++) {
			if(input.charAt(i)!=input.charAt(input.length()-1-i)) {
//				System.out.println("This is is not palindrome");
				x=false;
				break;
				
			}
			
			
			}
		if(x) {
			System.out.println("This is palindrome");
		}
		else {
			System.out.println("This is not palindrome");
		}
		
		}}
			
		

	


