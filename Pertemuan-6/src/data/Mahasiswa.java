package data;

public class Mahasiswa {
	
	private String nama;
	private String nim;
	private String password;
	private Jurusan jurusan;
	private JenisKelamin jenisKelamin;
	
	public Mahasiswa(String nim, String password) {
		this.nim = nim;
		this.password = password;
	}
	
	public String getNama() {
		return nama;
	}
	
	public void setNama(String nama) {
		this.nama = nama;
	}
	
	public String getNim() {
		return nim;
	}
	
	public void setNim(String nim) {
		this.nim = nim;
	}
	
	public Jurusan getJurusan() {
		return jurusan;
	}
	
	public void setJurusan(Jurusan jurusan) {
		this.jurusan = jurusan;
	}

	public JenisKelamin getJenisKelamin() {
		return jenisKelamin;
	}

	public void setJenisKelamin(JenisKelamin jenisKelamin) {
		this.jenisKelamin = jenisKelamin;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
