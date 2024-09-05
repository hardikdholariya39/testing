package AssignmentModule6;
import java.util.Scanner;


public class Q4PrimeNum {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int s = sc.nextInt();
		int number=100;
		int count=0;
		
		for(int i=1;i<=number;i++) {
			if((number % i)==0){
				number++;
				
			}
			if(number==2) {
				System.out.println("Prime");
			}
			else
				System.out.println("not prime");
			
		}
}


}
