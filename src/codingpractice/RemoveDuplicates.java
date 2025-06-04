package codingpractice;

import java.util.LinkedHashSet;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input ="Hi hello koi";
		LinkedHashSet<Character>set=new LinkedHashSet<>();
		for(char c :input.toCharArray()) {
			set.add(c);
		}
		StringBuilder sb=new StringBuilder();
		
		for(char i:set) {
			sb.append(i);
		}
		System.out.println("Duplicates excluded String is this: "+sb.toString());
		}
		

	}


