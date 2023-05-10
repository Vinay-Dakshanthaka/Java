package numbers;
public class PrimeNumber {
	public static void main(String[] args) {
		int n = 6;
		int sum = 0;
		int count = 0;
		for(int i = 1;i<=n;i++){
			if((n%i) == 2){
				sum +=n;
				System.out.println(i);
				count++;
			}
		}
		if(sum==n){
			System.out.println(n +" is a perfect number");
			System.out.println(count);
		}

{
			System.out.println("Not a perfect number");
		}
	}
}
