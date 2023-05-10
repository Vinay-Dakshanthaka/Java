package org.vinay.randomProgramsApp;
public class Armstrong {
	public static void main(String[] args) {
		int num =153;
		int temp = num;
		int sum = 0;
		while(num!=0){
			int last = 0;
			last=num%10;
			sum=sum+last*last*last;
			num=num/10;
		}
		if(sum==temp){
			System.out.println(temp + " is Armstrong Number");
		}
		else
		{
			System.out.println(temp + " is not Armstrong Number");
		}
	}
}
