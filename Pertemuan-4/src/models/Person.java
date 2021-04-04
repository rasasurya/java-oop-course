package models;

public abstract class Person {
	
	public String name;
	
	protected abstract void daftar();
	public abstract void getInfo();
	
	// Deprecated
//	public void getMahasiswa() {
//		System.out.println("=== Data Mahassiwa ===");
//		System.out.println("Nama: " + name);
//	}
	
	
}
