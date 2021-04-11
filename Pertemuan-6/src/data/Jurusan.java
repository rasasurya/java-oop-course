package data;

public enum Jurusan {
	
	INFORMATIKA("Teknik Informatika"),
	INDUSTRI("Teknik Industri"),
	ELEKTRO("Teknik Elektro"),
	MESIN("Teknik Mesin"),
	KIMIA("Teknik Kimia");
	
	private String detail;
	
	Jurusan(String detail){
		this.detail = detail;
	}
	
	public String getDetail() {
		return detail;
	}
	
}
