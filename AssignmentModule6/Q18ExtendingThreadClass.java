package AssignmentModule6;
class multi extends Thread{
	public void run() {
		System.out.println("Thread is running");
	}
}
public class Q18ExtendingThreadClass {
	public static void main(String[] args) {
		multi t=new multi();
		t.start();
		
	}
}
