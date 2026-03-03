package customer;

public class Car {
	private String ownerCar;
	private String name;
	private String carColor;
	private String LicensePlate;
	private int Km;
	
	
	public Car( String ownerCar, String name, String carColor, String licensePlate, int km) {
		super();
		this.ownerCar = ownerCar;
		this.name = name;
		this.carColor = carColor;
		LicensePlate = licensePlate;
		this.Km = km;
	}
	
	public void carDetails()  {
		
		System.out.println("----Customer Data----");
		System.out.println("Client : " + this.ownerCar);
		System.out.println("Name of the car : " + this.name);
		System.out.println("Color : " + this.carColor);
		System.out.println("License Plate : " + this.LicensePlate);
		System.out.println("car KM : " + this.Km);
		
	}

	
}
