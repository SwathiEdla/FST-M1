package activities;
import java.util.HashSet;
import java.util.Set;


public class Activity10 {

	public static void main(String[] args) {
		
	
	//Create a HashSet named hs.
	Set<Integer> numSet = new HashSet<>();
		
	//Add 6 objects using add() method to the HashSet.
	  numSet.add(100);
	  numSet.add(77230);
	  numSet.add(20800);
	  numSet.add(13980);
	  numSet.add(1298716);
	  
	//Then print the size of the HashSet using the size() method.
	  for (int num : numSet) {
		  System.out.println(num);
	  }
	//Remove an element using the remove() method.
	  numSet.remove(100);
	  
	//Also try to remove an element that is not present in the Set.
	  numSet.remove(1);
	//print size and the values form the set
	  System.out.println(" Size of teh Set :" + numSet.size());
	  System.out.println(numSet);
	//Use the contains() method to check if an item is in the Set or not.
	  System.out.println("Search for 100? " + numSet.contains(100));
	  
	//Print the updated set.
	  System.out.println(numSet);
	}
}
