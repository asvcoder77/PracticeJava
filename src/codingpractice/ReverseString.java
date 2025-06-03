package codingpractice;

public class ReverseString {
	String user="amal";	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String original="hello_hai";
		String reversed="";
		for(int i=original.length()-1;i>=0;i--) {
			reversed=reversed+original.charAt(i);
		}
		System.out.println(reversed);
		
		ReverseString rs=new ReverseString();
		rs.reverseString(rs.user);
		
	}
	
	//method to get reverse of the input
	public void reverseString(String input) {
		String reverse="";
		for(int j=input.length()-1;j>=0;j--) {
			reverse=reverse+input.charAt(j);
		}
		System.out.println(reverse);
	}

}
