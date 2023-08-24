package javaProgram;

import java.util.Scanner;

public class StringReversal {
	static Scanner sc;

	public static void main(String args[]) {
		sc = new Scanner(System.in);
		String str = getStringInput();
		reverseStringwithStringBuilder(str);
		reverseStringwithForSplitAndForLoop(str);
		reverseStringWithCharArray(str);
		sc.close();
	}

	public static String getStringInput() {
		System.out.println("Enter any string to make it reverse");
		String input = sc.nextLine();
		return input;
	}

	public static void reverseStringwithStringBuilder(String input) {
		StringBuilder sb = new StringBuilder();
		sb = sb.append(input);
		System.out.println("Reversed string with StringBuilder: " + sb.reverse());
	}

	public static void reverseStringwithForSplitAndForLoop(String input) {
		String[] arr = input.split("");
		System.out.print("Revresed String using Split: ");
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i]);
		}
		System.out.println("");
	}

	public static void reverseStringWithCharArray(String input) {
		char[] arr = input.toCharArray();
		String reverse = "";
		System.out.print("Revresed String using Char Array: ");
		for (int i = arr.length - 1; i >= 0; i--) {
			reverse += arr[i];
		}
		System.out.print(reverse);
	}
}
