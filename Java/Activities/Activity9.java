package activities;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Activity9 {
	
	public static void main(String[] args) { 
		
	
	//Create an ArrayList named myList of type String.
	List<String> strList = new ArrayList<>();
	
	//Add 5 names to the ArrayList using add() method.
	strList.add("Apple");
	strList.add("Cherry");
	strList.add("Banana");
	strList.add("Mango");
	strList.add("Watermilon");
	
	//Then print all the names using for loop.
	for(String name : strList) {
		System.out.println(strList);
	}
	//using iterator;
	Iterator<String> listItr = strList.iterator();
	 while(listItr.hasNext()) {
		 System.out.println(listItr.next());
	 }
	
	//Then use get() method to retrieve the 3rd name in the ArrayList.
	 System.out.println("3rd element in the list is: " + strList.get(2));
	
	//Use contains() method to check if a name exists in the ArrayList.
	 System.out.println("Is Chicku is in list: " + strList.contains("Chicku"));
	 
	//Use size() method to print the number of names in the ArrayList.
	 
	 System.out.println("Size of ArrayList: " + strList.size());
	 
	//Use remove() method to remove a name from the list and print the size() of the list again.
      strList.remove("Mango");
}
}
