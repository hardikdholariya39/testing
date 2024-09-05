package AssignmentModule6;
import java.util.ArrayList;
import java.util.List;

public class Q21RemoveEle {
	public static void main(String[] args) {
		List<String>list_String=new ArrayList<String>();
		list_String.add("Hardik");
		list_String.add("Ravi");
		list_String.add("Jaydip");
		list_String.add("Jayesh");
		list_String.add("Mayur");
		
		 	System.out.println(list_String);
		 	 
		 	list_String.remove(3);
		 	
		 	System.out.println("after removing third element from the list:\n"+list_String);
		 	
	}
}

