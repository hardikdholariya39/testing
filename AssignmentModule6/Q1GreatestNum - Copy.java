package AssignmentModule6;
import java.util.Scanner;


public class Q1GreatestNum {
	public static void main(String[] args) {
		
//      1. W.A.J.P to Take three numbers from the user and print the greatest number.

		Scanner sc = new Scanner(System.in);
		System.out.println("enter a :");
		int a = sc.nextInt();
		System.out.println("enter b :");
		int b = sc.nextInt();
		System.out.println("ent c :");
		int c = sc.nextInt();

		if (a > b) {
		System.out.println("greatest num "+ a);
		} else if (b >c) {
			System.out.println("greatest num" + b);
		} else {
			System.out.println("greatest num " + c);
		}

	}

}
                                                                               
