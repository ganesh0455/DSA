import java.util.*;

public class VectorPractice {

	public static void main(String[] args) {
		
		//Creation of Vector 
		Vector v1 = new Vector();
		
		//Adding elements
		v1.add("B1");
		v1.add(2);
		v1.add("C1");
		v1.add(3);
		v1.add("D1");
		v1.add(4);
		
		//Adding elements in specified index
		v1.add(0,"A1");
		v1.add(1,1);
		v1.add("E1");
		v1.add(5);
		
		v1.add("B2");
		v1.add(2);
		v1.add("C2");
		v1.add(3);
		v1.add("D2");
		v1.add(4);
		
		//Adding elements in specified index
		v1.add(0,"A2");
		v1.add(1,1);
		v1.add("E2");
		v1.add(5);
		
		//Size of Vector
		System.out.println("Size: "+v1.size());
		
		//Capacity of Vector
		System.out.println("Capacity: "+v1.capacity());
		System.out.println(v1);
		
		
		Vector v2 = new Vector();
		v2.add("Chethu");
		v2.add("Ganesh");
		
		// Concatenating the v2 vector with v1
		//Way 1
		for(int i=0; i<v2.size(); i++) {
			v1.add(v2.get(i)); // here get(index) method use to retrieval of elements on particular index
		}
		
		//Way 2
		v1.addAll(v2);
		System.out.println(v1);
		
		// concatenating v2 vector collection with v1 collection on 0th index
		v1.addAll(0,v2);
		System.out.println(v1);
		
		
		//Searching
		
		//Search for particular value
		v1.contains("Ganesh");
		
		Vector v3 = new Vector();
		v3.add("Ganesh");
		v3.add("Chethu");
		
		//Search for collection of values irrespective of the order
		v1.containsAll(v3); // output: true
		
		//Updating elements
		v1.set(1,"Ganesh");
		
		//Miscllanious Methods
		
		//Index of particular element
		v1.indexOf("Checthu");
		
		//Index of last occurence of particular value
		v1.lastIndexOf("Chethu")
		
		//Last elemrnt
		v1.lastElement();
		
		//first Element
		v1.firstElement();
		
		//Convert vector to Array
		Object[] array = v1.toArray(); 
		
		//we can't print array directly without for loop, for getting entire array
		Arrays.toString(array);
		
		//Removing the elements from the list
		
		//Removing on specified index
		v1.remove(0);
		System.out.println(v1);
				
		//Removing the specified value
		v1.remove("Ganesh");
		System.out.println(v1);
				
		//Removing collection of elements
		v1.removeAll(v2);
		System.out.println(v1);
				
		//Removing all elements in v1 vector
		v1.clear();
		
	}
}