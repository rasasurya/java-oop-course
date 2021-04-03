package app;

import java.util.Scanner;


//import data.Admin;
//import data.Users;

import polymorph.*;

public class MainApp {

	private static Scanner masuk;

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
		var masukan = new Scanner(System.in);
		
		System.out.println("Masukkan Nama: " );
		man.name = masukan.nextLine();
		man.iam();
		
		Student student = new Student("Sinta", "18725234");
		student.iam();
		
		Employee employee = new Employee("Kumar");
		System.out.println(employee.toString());
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
