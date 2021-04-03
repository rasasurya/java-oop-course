package data;

public class Admin extends Users{
	
	protected int age;
	
	// constructor
	public Admin(String username, int age) {
		
		this.username = username;
		// error cause private property
		setPassword("12345");
		this.age = age;
		
	}
	
	
	public void getInfoUser() {
		System.out.println("Username: " + username);
		// error cause private property
		 System.out.println("Password: " + getPassword());
		System.out.println("Age: " + age);
	}
	
	public String getPassword() {
		return super.getPassword();
	}
	
	public void setPassword(String pass) {
		super.setPassword(pass);
	}
}

