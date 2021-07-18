package chap11.section06;

public class ReflectionCar {
	
	public String model;
	public String owner;
	
	public ReflectionCar() {
		
	}
	
	public ReflectionCar(String model, String owner) {
		this.model = model;
		this.owner = owner;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}
	
}
