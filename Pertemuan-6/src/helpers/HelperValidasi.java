package helpers;

import data.Mahasiswa;
import error.ValidasiNama;
import error.ValidasiPendaftaran;

public class HelperValidasi {
	
	public static void chekValidasi(Mahasiswa mahasiswa) throws ValidasiPendaftaran{
		
		if (mahasiswa.getNim() == null) {
			
			throw new ValidasiPendaftaran("Nim tidak boleh null");
			
		}else if (mahasiswa.getNim().isBlank()) {
			
			throw new ValidasiPendaftaran("Nim tidak boleh kosong");
			
		}if (mahasiswa.getPassword() == null) {
			
			throw new ValidasiPendaftaran("Password tidak boleh null");
			
		}else if (mahasiswa.getPassword().isBlank()) {
			
			throw new ValidasiPendaftaran("Password tidak boleh kosong");
			
		}
		
	}
	
	
	public static void chekNama(Mahasiswa mahasiswa) throws ValidasiNama{
		
		if (mahasiswa.getNim() == null) {
			
			throw new ValidasiNama("Nim tidak boleh null");
			
		}else if (mahasiswa.getNim().isBlank()) {
			
			throw new ValidasiNama("Nim tidak boleh kosong");
			
		}if (mahasiswa.getPassword() == null) {
			
			throw new ValidasiNama("Password tidak boleh null");
			
		}else if (mahasiswa.getPassword().isBlank()) {
			
			throw new ValidasiNama("Password tidak boleh kosong");
			
		}
		
	}
	
}
