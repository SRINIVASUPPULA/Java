package javaProgram;

public class DulicateWordsinString {

	public static void main(String[] args) {
		String string = "Big black bug bit a big black dog on his big black nose";
		int count;

		/*
		 * string = string.toLowerCase(); String[] words = string.split(" "); for (int i
		 * = 0; i < words.length; i++) { count = 1; for (int j = i + 1; j <
		 * words.length; j++) { if (words[i].equals(words[j])) { count++; words[j]="0";
		 * } } if (count > 1&&words[i]!="0") System.out.println(words[i]+" "+count); }
		 */
		
		
		String arr[] = string.split(" ");
		String reverse="";
		for(int i=arr.length-1;i>=0;--i) {
		reverse = reverse+arr[i]+" ";	
		}
		System.out.println(reverse);
	}

}
