package org.vinay.randomProgramsApp;
public class ToUpperCase {
	public static void main(String[] args) {
		String name = "Swami Vivekananda";
		System.out.println(name.toUpperCase());
		System.out.println(name.toLowerCase());
		for(int i =0;i<=name.length()-1;i++){
			char ch = name.charAt(i);
			System.out.println((char)(ch + 32));
		}
	}
}
