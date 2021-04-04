package models;

import java.util.Scanner;

public class Mahasiswa extends Person{
	
	protected String nim;
	
	@Override
	protected void daftar() {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Masukkan Nama: ");
		name = in.nextLine();
		System.out.print("Masukkan NIM: ");
		nim = in.nextLine();
	}

	@Override
	public void getInfo() {
		// TODO Auto-generated method stub
		System.out.println("Nama: "+ name);
		System.out.println("NIM: "+ nim);
	}
	
	public void jalanDaftar() {
		daftar();
	}
}
