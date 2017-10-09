
public class PointsNearestToEachOther {
	public static void main(String[] args) 
	{

		// Set up the points in the array
		double[][] points = {{-1, 0, 3}, {-1, -1, -1}, {4, 1, 1},                      
			{2, 0.5, 9}, {3.5, 2, -1}, {3, 1.5, 3}, {-1.5, 4, 2},                          
			{5.5, 4, -0.5}};

		// p1 and p2 are the indices in the points' array
		int point1 = 0, point2 = 1, point3 = 3; // Initial two points
		double shortestDistance = distance(points[point1][0], points[point1][1], points[point1][2], points[point2][0], points[point2][point1], points[point3][point2]); 

		// Compute the distance for every two points
		for (int i = 0; i < points.length; i++) 
		{
			for (int j = i + 1; j < points.length; j++) 
			{
				double distance = distance(points[i][0], points[i][1], points[i][2], points[j][0], points[j][1], points[j][2]); 

				if (shortestDistance > distance)
				{
					// Updates these values
					point1 = i; 
					point2 = j; 
					shortestDistance = distance; 
				}
			}
		}

		// Display the result
		System.out.println("The closest two points are " +
			"(" + points[point1][0] + ", " + points[point1][1] + ") and (" +
				points[point2][0] + ", " + points[point2][1] + ")"); // JA: You forgot to include the z coordinate
	}

	// Finds the distance between the two points
	public static double distance(
		double x1, double y1, double z1, double x2, double y2, double z2) {
		return Math.sqrt(Math.pow(x2 - x1, 2) +  
			Math.pow(y2 - y1, 2) + Math.pow(y2 - y1, 2)); // JA: last term is z2 - z1
	}
}
