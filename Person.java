package testperson;

public class Person implements Comparable<Person> {

	private String firstName;
	private String lastName;
	private String gender;
	private float height;
	private float weight;

	// default constructor
	public Person() {

	}

	// parameterized constructor
	public Person(String firstName, String lastName, String gender, float height, float weight) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.height = height;
		this.weight = weight;
	}

	// getters
	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getGender() {
		return gender;
	}

	public float getHeight() {
		return height;
	}

	public float getWeight() {
		return weight;
	}

	// setters
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", gender=" + gender + ", height=" + height
				+ ", weight=" + weight + "]";
	}

	@Override
	public int compareTo(Person o) {
		return lastName.compareTo(o.lastName);
	}

}
