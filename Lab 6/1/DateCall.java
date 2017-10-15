
public class DateCall {

	public static void main(String[] args) {
		
		/** Calls to DateObject */
		DateObject myDateObject = new DateObject();
		
		myDateObject.setTime();
		
		/** These will call to the DateObject to get the setTimes */
		
			myDateObject.getTime();
			System.out.println("The date with 10000 elapsed time is: " + myDateObject.getTime());
		
		myDateObject.setTime2();
		
			myDateObject.getTime();
			System.out.println("The date with 100000 elapsed time is: " + myDateObject.getTime());
		
		myDateObject.setTime3();
		
			myDateObject.getTime();
			System.out.println("The date with 1000000 elapsed time is: " + myDateObject.getTime());
		
		myDateObject.setTime4();
		
			myDateObject.getTime();
			System.out.println("The date with 10000000 elapsed time is: " + myDateObject.getTime());
		
		myDateObject.setTime5();
		
			myDateObject.getTime();
			System.out.println("The date with 100000000 elapsed time is: " + myDateObject.getTime());
			
		myDateObject.setTime6();
			
			myDateObject.getTime();
			System.out.println("The date with 1000000000 elapsed time is: " + myDateObject.getTime());
			
		myDateObject.setTime7();
			
			myDateObject.getTime();
			System.out.println("The date with 10000000000 elapsed time is: " + myDateObject.getTime());
			
		myDateObject.setTime8();
			
			myDateObject.getTime();
			System.out.println("The date with 100000000000 elapsed time is: " + myDateObject.getTime());
	}

}
