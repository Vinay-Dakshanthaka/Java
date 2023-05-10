package org.vinay.randomProgramsApp;

public class PalindromeString {
	public static void main(String[] args) {
		String str = "NAKKAN";
		String rev = "";
		for(int i=str.length()-1;i>=0;i--){
			//taking character by character
			char ch=str.charAt(i);
			//Concatenating character
			rev=rev+ch;
		}
		System.out.println(rev);
		System.out.println(str);
		if(rev.equalsIgnoreCase(str)){
			System.out.println(str +" is a PALINDROME WORD");
		}
		else{
			System.out.println(str +" is not a PALINDROME WORD");
		}
	}
}
