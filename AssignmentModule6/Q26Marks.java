package AssignmentModule6;
import java.util.Scanner;


public class Q26Marks {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter marks = ");
		int m = sc.nextInt();
		if (m <=40) {
			System.out.println("fail");
		} else if (m >= 41 && m <= 50) {
			System.out.println("DD class");	
		} else if (m >= 51 && m <= 60) {
			System.out.println("CD class");
		} else if (m >= 61 && m <= 70) {
			System.out.println("BC class");
		} else if (m >= 71 && m <= 80) {
			System.out.println("BB class");
		} else if (m >= 81 && m <= 90) {
			System.out.println("AB grade");
		} else if (m >= 91 && m <= 100) {
			System.out.println("AA class");
		} else {
			System.out.println("invalid input");
		}


}
}
