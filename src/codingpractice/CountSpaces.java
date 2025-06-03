package codingpractice;

public class CountSpaces {
	static int x=0;
	static int y=0;
	static int z=0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sentence="hi hello world@";
		for(int i=0;i<sentence.length();i++) {
			if (sentence.charAt(i)==' ') {
				x++;	
			}
			
		
		

	}
		System.out.println("Number of spaces in sentence is "+x);

}}
