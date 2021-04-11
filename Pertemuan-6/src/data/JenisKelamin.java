package data;

public enum JenisKelamin {
	L("Laki-laki"),
	P("Perempuan");
	
	private String detail;
	
	JenisKelamin(String detail){
		this.detail = detail;
	}
	
	public String getDetail() {
		return detail;
	}
}
