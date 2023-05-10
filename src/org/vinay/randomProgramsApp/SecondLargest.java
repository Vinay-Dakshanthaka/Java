package numbers;
public class SecondLargest {
	public static void main(String[] args) {
		int x[] = {1,2,3,59,4,32,5,55,6,44,2};
		int first = 0;
		int second = 0;
		for(int i = 0; i<=x.length-1;i++){
			int n= x[i];
			if(n>first){
				second=first;
				first=n;
			}
			else if(n>second){
				second=n;
			}
		}
		System.out.println(second);
	}
}
