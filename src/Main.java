
public class Main {
	
	public static void main(String[] args){
		
		Car car1 = new Car();
		
		car1.setColor("gumus");
		car1.setModel("clio");
		car1.setEngine(1.6);
		car1.setDoors(1);
		
		
		
		
		/*
		  car1.color = "gumus";
		 
		car1.model = "Renault Megane";
		car1.engine= 1.6;
		car1.doors=4;
		*/
		System.out.println("arabanın rengi: " + car1.getColor());
		System.out.println("arabanın modeli: " + car1.getModel());
		System.out.println("arabanın motor hacmı: " + car1.getEngine());
		System.out.println("arabanın kapı sayısı: " + car1.getDoors());
		
		car1.start();
		car1.stop();
		
		
		
		
	}
}
