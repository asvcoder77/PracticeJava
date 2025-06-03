package codingpractice;

public class Count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int vowels=0;
		int consonents=0;
		int number=0;
		int specialcharacter=0;
		String input = "Hi hello**123 world";
		String nospace=input.replaceAll("\\s", "");
		char[]newarray=nospace.toCharArray();
		for(char ch: newarray)
		{
			if(Character.isLetter(ch)) {
				if("AEIOUaeiou".indexOf(ch)!=-1) {
					vowels++;
				}
				else {
					consonents++;
				}
		}else if(Character.isDigit(ch)) {
			number++;
		}else {
			
			specialcharacter++;
		}

	}
		System.out.println("Vowels count is: "+vowels);
		System.out.println("Consonents count is: "+consonents);
		System.out.println("Digits count is: "+number);
		System.out.println("Specialcharacters count is: "+specialcharacter);
	}}
