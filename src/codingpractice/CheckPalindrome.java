package codingpractice;

public class CheckPalindrome {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input="abcdffdcba";
		for(int i=0;i<input.length()/2;i++) {
			if(input.charAt(i)!=input.charAt(input.length()-1-i)) {
				System.out.println("This is is not palindrome");
				break;
			}
			else if(i==input.length()/2-1) {
				System.out.println("This is palindrome");
				
			}
			
			
			

			}
			
		}

	}


