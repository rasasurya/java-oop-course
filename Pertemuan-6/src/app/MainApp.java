package app;

import java.util.Scanner;

import data.JenisKelamin;
import data.Jurusan;
import data.Mahasiswa;
import error.ValidasiPendaftaran;
import helpers.HelperValidasi;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner k = new Scanner(System.in);
		System.out.println("=== PENDAFTARAN KKN ===");
		System.out.print("NIM: ");
		String nim = k.nextLine();
		System.out.print("Password: ");
		String password = k.nextLine();
		
		Mahasiswa maba = new Mahasiswa(nim, password);
		// Mahasiswa lama = new Mahasiswa(null, null);
		
		//maba.setNama("Suryadi");
		// maba.setPassword("12345");
		//maba.setJurusan(Jurusan.INFORMATIKA);
		// maba.setNim(null);
		//maba.setJenisKelamin(JenisKelamin.L);
		System.out.println("Koneksi DATABASE");
		
//		try {
//			HelperValidasi.chekValidasi(maba);
//			System.out.println("Data valid");
//			System.out.println("Koneksi Berhasil");
//		} catch (ValidasiPendaftaran e) {
//			System.out.println("Data tidak valid");
//			System.out.println("Koneksi Gagal");
//			System.out.println("Error: "+ e.getMessage());
//		} finally {
//			System.out.println("Tutup Koneksi");
//		}
		
		HelperValidasi.chekNama(maba);
		
		
//		System.out.println("Nama: "+ maba.getNama());
//		System.out.println("Nim: "+ maba.getNim());
//		System.out.println("Jurusan: "+ maba.getJurusan().getDetail());
//		System.out.println("Jenis Kelamin: "+ maba.getJenisKelamin().getDetail());
	}

}
