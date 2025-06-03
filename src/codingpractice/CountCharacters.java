package codingpractice;

public class CountCharacters {
	static int count=0;
//count letter (exclude spaces) in a sentence
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sentence="hi hello man";
		for(int i=0;i<sentence.length();i++) {
			if(Character.isLetter(sentence.charAt(i))) {
				count++;
			}
			
		}
		System.out.println("Count of letters in sentence is "+count);

	}

}
  