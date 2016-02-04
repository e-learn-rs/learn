package hackerrank;

import java.util.HashMap;
import java.util.HashSet;

public class ManagerEmployeeInfo 
{
	
	public static void main(String args[])
	{
		HashMap<String,String> employee2Manager = new HashMap<String, String>();
		employee2Manager.put("D", "E");
		employee2Manager.put("B", "C");
		employee2Manager.put("C", "F"); 
		employee2Manager.put("E", "F");
		employee2Manager.put("F", "F");
		employee2Manager.put("A", "C");
		
		HashMap<String,HashSet<String>> manager2Employees = new HashMap<String, HashSet<String>>();
		
		for(String employee : employee2Manager.keySet())
		{
			String manager = employee2Manager.get(employee);
			if(employee.equals(manager))
			{
				continue;
			}
			else
			{
				if(manager2Employees.containsKey(manager))
				{
					HashSet<String> employees = manager2Employees.get(manager);
					if(employees == null)
						employees = new HashSet<String>();
					employees.add(employee);
					manager2Employees.put(manager, employees);
				}
				else
				{
					HashSet<String> employees = new HashSet<String>();
					employees.add(employee);
					manager2Employees.put(manager, employees);
				}
			}
			if(!manager2Employees.containsKey(employee)) 
			{
				manager2Employees.put(employee, null);
			}
		}
		
		for(String manager : manager2Employees.keySet())
		{
			HashSet<String> employees = manager2Employees.get(manager);
			if(employees == null )
			{
				System.out.println(manager+" - "+0);
				continue;
			}
			int count = employees.size(); 
			for(String employee : employees)
			{
				if(manager2Employees.containsKey(employee))
				{
					if(manager2Employees.get(employee) != null ) 
					count += manager2Employees.get(employee).size();
				}
			}
			System.out.println(manager+" - "+count); 
		}
	}

}
