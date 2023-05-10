package numbers;
public class ReverseNume {
	public static void main(String[] args) {
		long num = 9876554321L;
		long rev=0;
		while(num!=0){
			long last = num%10;
			rev = (rev*10)+last;
			num = num/10;
		}
		System.out.println(rev);
	}
}
