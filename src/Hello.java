public class Hello {

	public static void main(String[] args) {
		System.out.println();
		System.out.println("Hello World!");
		Car myCar;
		myCar = new Car();
		myCar.setPrice(20_000_000);
		System.out.println(myCar.getPrice());
		System.out.println(myCar.getModel().length());


	}
}

class Car {

	int price;
	String model = "BMW X5";

	public int getPrice() {
		return price;

	}

	public void setPrice(int newPrice){


	}

	public String getModel(){
		return model;
	}
}