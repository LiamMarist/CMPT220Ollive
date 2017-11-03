import java.util.ArrayList;

public class TestCourse {

	public static void main(String[] args) {
	//	Course course1 = new Course("Data Structures");
	//	Course course2 = new Course("Database Systems");
		
		ArrayList<String> course1List = new ArrayList<>();
		ArrayList<String> course2List = new ArrayList<>();
		
		course1List.add("Peter Jones");
		course1List.add("Kim Smith");
		course1List.add("Anne Kennedy");
		
		course2List.add("Peter Jones");
		course2List.add("Steven Smith");
		
		System.out.println("Number of students in course1: " + course1List.size());
		
		for (int i = 0; i < course1List.size(); i++)
			System.out.println(course1List.get(i) + ", ");
		
		
		System.out.println();
		
		
		System.out.println("Number of students in course2: " + course2List.size());
		
		for (int i = 0; i < course2List.size(); i++)
			System.out.println(course2List.get(i) + ", ");
		
	

		

	}

}
