package Example.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AnimalSort 
{

	public static void main(String args[])
	{ 
	      // Takes a list o Dog objects
	      List<Animal> list = new ArrayList<Animal>(); 

	      list.add(new Animal("Shaggy",3));
	      list.add(new Animal("Lacy",2));
	      list.add(new Animal("Roger",10));
	      list.add(new Animal("Tommy",4));
	      list.add(new Animal("Tammy",1));
	      
	      Collections.sort(list);// Sorts the array list

	      for(Animal a: list)//printing the sorted list of names
	         System.out.print(a.getName() + ", ");

	      // Sorts the array list using comparator
	      Collections.sort(list, new Animal()); 
	      System.out.println(" ");
	      for(Animal a: list)//printing the sorted list of ages
	         System.out.print(a.getName() +"  : "+
			 a.getAge() + ", ");
	   }
}
