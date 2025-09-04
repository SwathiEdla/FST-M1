package activities;

public class Activity2 {

	public static void main(String[] args) {
		int nums [] = {10,77,10,54,-11,10};
		int i;
		int result = 0;
		
		
		for (int num : nums) {
			
			if (num == 10) {
				result += num;
			
			}
					
		}
	
		System.out.println(" the result is: " + result);
	}
}

