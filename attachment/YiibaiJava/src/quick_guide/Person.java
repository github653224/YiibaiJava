package quick_guide;

public class Person {
	// This is field
	// The name of Person
	public String name;

	// This is a Constructor
	// Use it to initialize the object (Create new object)
	// This constructor has one parameter
	// Constructor always have the same name as the class.
	public Person(String persionName) {
		// Assign the value of the parameter into the 'name' field
		this.name = persionName;
	}

	// This method returns a String ..
	public String getName() {
		return this.name;
	}
}
