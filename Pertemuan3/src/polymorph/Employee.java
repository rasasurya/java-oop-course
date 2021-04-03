package polymorph;

public class Employee extends Human{
	public int salary;
	
	public Employee(String name) {
		super(name);
		salary = 5_000_000;
	}
	
	public void iam() {
		System.out.println("Saya adalah "+ name +" seorang karyawan dengan gaji " + salary);
	}
}
