package models;

public class Samsung implements Phone{

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("Samsung is on");
	}

	@Override
	public void turnOf() {
		// TODO Auto-generated method stub
		System.out.println("Samsung is off");
	}
	
	public void getBrands() {
		System.out.println("The brand name is Samsung");
	}
	
	public static void main(String[] args) {

		Samsung a10 = new Samsung();
		IPhone x = new IPhone();
		
		System.out.println(a10.NAME);
		a10.getBrands();
		a10.turnOn();
		a10.turnOf();
		
	}
	
	static void status(Phone phone) {
		phone.turnOn();
		phone.turnOf();
	}
	
}
