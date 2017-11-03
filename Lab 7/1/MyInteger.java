
public class MyInteger {


		
		private int value;
		
		public MyInteger(int value) {
			this.value = value;
		}

		public void setValue(int value) {
			this.value = value;
		}
		
		public boolean isEven1(){
			
			if(value % 2 == 0) {
			return true;
			}else 
				return false;
		}
		
		public boolean isOdd1(){
			if( !isEven1()) {
				return true;
			} else return false;
		}
		public boolean isPrime1(){
			 

		        for (int i = 2; i < value; i++) {
		            if (value % i == 0) return false;
		        }
		        return true;
		}
		
		// Static Methods
	
		public static boolean isEven2(int value){
			
			if(value % 2 == 0) {
			return true;
			}else 
				return false;
		}
		
		public static boolean isOdd2(int value){
			
			
			if( !isEven2(value)) {
				return true;
			} else return false;
			
		}
		public static boolean isPrime2(int value){
			 

		        for (int i = 2; i < value; i++) {
		            if (value % i == 0) return false;
		        }
		        return true;
		}
		
		// Static MyInteger methods
		
		public static boolean isEven3(MyInteger even) {
			return even.isEven1();
		}
		
		public static boolean isOdd3(MyInteger odd) {
			return odd.isOdd1();
		}
		public static boolean isPrime3(MyInteger prime) {
			return prime.isPrime1();
		}
		
		// Equals Methods
		
		public boolean equals(int value2) {
			if(this.value == value2) {
				return true;
			}else
				return false;
			
		}
		
		public boolean equals2(MyInteger value3) {
			return value3.equals(value);
		}
		
		 public static int parseInt(char[] array) {

		        int aValue = 0;
		        for (int i = 0; i < array.length; i++) {
		        	
		        	aValue = aValue * 10 + (Character.getNumericValue(array[i]));
		         
		        }

		        return aValue;
		    }
	
		
		 public static int parseInt(String value) {

		        return MyInteger.parseInt(value.toCharArray());
		    }
		    
	
}

	
	


