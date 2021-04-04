package models;

public class IPhone implements Phone{

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("iPhone is on");
	}

	@Override
	public void turnOf() {
		// TODO Auto-generated method stub
		System.out.println("iPhone is off");
	}

	@Override
	public void getBrands() {
		// TODO Auto-generated method stub
		System.out.println("The brands is Apple.inc");
	}
	
}
