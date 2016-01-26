package org.learn;

import java.util.List;

public class Batch
{
	private List<Student> students; 

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}
	public void init()
	{
		System.out.println("Initializing Batch..");
	}
	
	public void cleanUp()
	{
		System.out.println("Cleaning up batch ...");
	}
}
