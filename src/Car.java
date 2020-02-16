
public class Car {
	//fields properties
	private String color;
	private String model;
	private double engine;
	private int doors;
	
	public void setColor(String color) {

		this.color=color;
	}
	public String getColor() {
		return this.color;
	}
	public void setModel(String model) {

		this.model=model;
	}
	public String getModel() {
		return this.model;
	}
	public double getEngine() {
		return engine;
	}
	public void setEngine(double engine) {
		this.engine = engine;
	}
	public int getDoors() {
		return doors;
	}
	public void setDoors(int doors) {
		
		if(doors == 2 || doors == 4) {
			this.doors = doors ;
		}
		else {
			System.out.println("kapı sayısı sadece 2 veya dort olabilir.");
		}
		
	}
	public void start() {
		System.out.println("araba calıstı...");
	}
	public void stop() {
		System.out.println("araba durdu...");
	}
	
}	
