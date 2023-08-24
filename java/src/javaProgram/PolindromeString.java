package javaProgram;

public class PolindromeString {

	public static void main(String[] args) {
		
		String str = "abccba";
		boolean flag = true;
		str = str.toLowerCase();
		
		for(int i=0;i<str.length()/2;i++) {
			System.out.println(str.length()/2+" "+str.charAt(i)+" "+str.charAt(str.length()-i-1));
			if(str.charAt(i)!=str.charAt(str.length()-i-1)){
				
				flag = false;
				break;
			}
		}
		if(flag) {
			System.out.println("String is Polindrome");
		}
		else
			System.out.println("String is not a Polindrome");
		
		
	}

}
