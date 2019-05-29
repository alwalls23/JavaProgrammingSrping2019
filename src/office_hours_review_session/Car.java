package office_hours_review_session;

public class Car {
	private String make, model, price;
	
	public Car(String make, String model, String price) {
		this.make = make;
		this.model = model;
		this.price = price;
		
		//CMD + Nmac
		//CTRL + N windows
	}
	public void setPrice(String price) {
		this.price = price;
	}

	public String getMake() {
		return make;
	}

	public String getModel() {
		return model;
	}

	public String getPrice() {
		return price;
	}
}
