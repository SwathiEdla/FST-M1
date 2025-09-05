package activities;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Activity13 {
	public static void main(String[] args) {
		// Create an empty list
		List<Integer> intList = new ArrayList<>();
		//Create scanner object 
				Scanner sc = new Scanner(System.in); 
		//Create random object 
				Random rand = new Random();
		//Take user input and add number to the list 
				System.out.println("Enter the random numbers");
				while(sc.hasNextInt()) {
					intList.add(sc.nextInt());
		
				}
		// Print the list	
				System.out.println("List of Numbers " + intList);
				// close the scanner
				sc.close();
		// Generate Random Index number
				int getIndex = rand.nextInt(intList.size()-1);
				System.out.println("Generated Index " + getIndex);
		// 	Get the value at the random index
				System.out.println("Value at Index " + intList.get(getIndex));	
	}

}
