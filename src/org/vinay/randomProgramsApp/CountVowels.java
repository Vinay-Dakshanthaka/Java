package org.vinay.randomProgramsApp;

public class CountVowels {
public static void main(String[] args) {
	String str =  "Hello world how are your";
	int Vcount = 0;
	int Ccount = 0;
	for(int i = 0;i<=str.length()-1;i++){
		char ch = str.charAt(i);
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
			Vcount++;
			System.out.println(ch);
		}
		else{
			Ccount++;
		}
	}
	System.out.println("Number of Vowels is : " +Vcount +
			"\nNumber of Consonants : "+ Ccount);
}
}
