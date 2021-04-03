package data;

public class Users {
	public String username;
	private String password = "qwerty";
	private boolean status;
	
	public void getInfoUser() {
		System.out.println("Username: " + username);
		System.out.println("Password: " + password);
	}
	
	protected String getPassword() {
		return password;
	}
	
	protected void setPassword(String password) {
		this.password = password;
	}
	
	// getter
	public boolean isStatus() {
		return status;
	}
	
	public void setStatus(boolean status) {
		this.status = status;
	}
	
}
