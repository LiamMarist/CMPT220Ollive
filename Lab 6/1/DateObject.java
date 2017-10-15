import java.util.Date;

public class DateObject {
	
	private static java.util.Date time;
	
	DateObject()
	{
		time = new java.util.Date();
	}
	
	DateObject(double newTime)
	{
		time = new java.util.Date();
	}
	
	/** Sets the elapsed time */
	
	public void setTime() {
		time = new java.util.Date(10000);
	}
	
	public void setTime2() {
		time = new java.util.Date(100000);
	}
	
	public void setTime3() {
		time = new java.util.Date(1000000);
	}
	
	public void setTime4() {
		time = new java.util.Date(10000000);
	}
	
	public void setTime5() {
		time = new java.util.Date(100000000);
	}
	
	public void setTime6() {
		time = new java.util.Date(1000000000);
	}
	
	/** I'm not sure why it sets time backwards, but this is the closest I can currently get */
	
	public void setTime7() {
		time = new java.util.Date(1000000000 * 10);
	}
	
	public void setTime8() {
		time = new java.util.Date(1000000000 * 100);
	}
	
	/** gets the new time */
	
	public String getTime()
	{
		return time.toString();
	}
	
}
