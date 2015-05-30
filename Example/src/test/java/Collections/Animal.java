package Collections;

import java.util.Comparator;

public class Animal implements Comparable<Animal> , Comparator<Animal>
{
	private String name;
	private int age;

	public Animal()
	{
		
	}
	public Animal(String name , int age)
	{
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public int compare(Animal o1, Animal o2) {
		// TODO Auto-generated method stub
		return o1.age - o2.age; 
	}

	@Override
	public int compareTo(Animal o) {
		// TODO Auto-generated method stub
		return (this.name).compareTo(o.name); 
	}

}
