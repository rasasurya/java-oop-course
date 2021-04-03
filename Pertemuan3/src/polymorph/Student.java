package polymorph;

public class Student extends Human{
	public String nim;
	
	public Student(String name, String nim) {
		super(name);
		this.nim = nim;
	}

	
	public void iam() {
		System.out.println("Saya adalah " + name + " seorang mahasiswa dengan nim " + nim);
	}
}
