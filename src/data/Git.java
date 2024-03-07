package data;

public class Git {
	public static void main(String[] args) {
		
		String hungry ="yes";
		
		if (hungry == "yes")
			System.out.println("eat something ...............");
		else {
			System.out.println("Do work hard............");
			
	}
}
}


===========from here =============
public class Car {
    private String make;
    private String model;
    private int year;

    // Constructor
    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    // Getter methods
    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public static void main(String[] args) {
        Car myCar = new Car("Toyota", "Camry", 2022);
        System.out.println("My car: " + myCar.getMake() + " " + myCar.getModel() + " (" + myCar.getYear() + ")");
    }
}
=====================================================
				
