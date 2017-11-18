import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Shuffle {

	public static void main(String[] args) {
		ArrayList<Number> list = new ArrayList();
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		System.out.println("The original list is: " + list);
		
		System.out.println("The list shuffled is: " + shuffle(list)); // calls to the shuffle method and displays the shuffled list
	}
	
	public static ArrayList<Number> shuffle(ArrayList<Number> list) {
		
		Collections.shuffle(list); // shuffles the list
		
		return list;	
	}
}
