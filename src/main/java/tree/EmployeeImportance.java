package tree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeeImportance {
	Map<Integer, Employee> map;
	 public List<Employee> addEmployee() {
		 
		Employee e = new Employee();
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		List<Integer> li = new ArrayList<Integer>();
		List<Integer> li2 = new ArrayList<Integer>();
		List<Employee> emp = new ArrayList<Employee>();
		
		li.add(2);
		li.add(3);
		e.setId(1);
		e.setImportance(5);
		e.setSubordinates(li);
		
		//li2.add(0);
		
		e1.setId(2);
		e1.setImportance(3);
		e1.setSubordinates(li2);
		
		e2.setId(3);
		e2.setImportance(3);
		e2.setSubordinates(li2);
		
		emp.add(e);
		emp.add(e1);
		emp.add(e2);
		return emp;
	 }
	
	
	public static void main(String[] args) {
		EmployeeImportance ei = new EmployeeImportance();
		int queryId = 1;
		
		int totalImportance = ei.getImportance(ei.addEmployee(),queryId);
		System.out.println(totalImportance);

	}
	
	private  int getImportance(List<Employee> emp, int queryId) {
		map = new HashMap<Integer, Employee>();
		for(Employee em : emp) {
			map.put(em.id, em);
		}
		return dfs(queryId);
		
	}

	private int dfs(int queryId) {
		Employee e = map.get(queryId);
		int sum = e.importance;
		for(int subEmp: e.subordinates ) {
			sum = sum + dfs(subEmp);
		}
		return sum;
	}

	public  class Employee{
		public int id;
	    public int importance;
	    public List<Integer> subordinates;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public int getImportance() {
			return importance;
		}
		public void setImportance(int importance) {
			this.importance = importance;
		}
		public List<Integer> getSubordinates() {
			return subordinates;
		}
		public void setSubordinates(List<Integer> subordinates) {
			this.subordinates = subordinates;
		}
		
	    
	}

}
