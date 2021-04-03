package app;

//import data.Admin;
//import data.Users;

import polymorph.*;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Users admin = new Users();
//		
//		admin.username = "limidev";	
//		Admin limidev = new Admin("limidev", 27);
//		
//		System.out.println("Sebelum");
//		System.out.println("Your password: " + limidev.getPassword());
//		System.out.println("Sesudah");
//		limidev.setPassword("uvuvewew");
//		System.out.println("Your new password: " + limidev.getPassword());
		
		Human man = new Human("Kiki");
		man.iam();
		
		Student student = new Student("Sinta", "18725234");
		student.iam();
		
		Employee employee = new Employee("Kumar");
		employee.iam();
		
		who(man);
		who(student);
		who(employee);
	}
		
	// <tipe_data> <nama_variable>
	
	static void who(Human mirza) {
		System.out.println("hai " + mirza.name);
	}

}
