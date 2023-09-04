package killer;

public class Employee {
	
	public void work(String name) {
		System.out.println(name);
	}
	public void work(String name,int id) {
		System.out.println(name+" "+id);
	}
	public void work(int id, String name) {
		System.out.println(id+ " " +name);
	}
	public static void main(String[] args) {
		Employee e=new Employee();
		e.work("ranjith");
	}

}
