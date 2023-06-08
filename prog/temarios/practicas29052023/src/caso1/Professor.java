package caso1;

public class Professor extends Person{
	private double salary;

	public Professor(String name, String phoneNumber, double salary) {
		super(name, phoneNumber);
		this.salary = salary;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public void pruchase() {
		// TODO Auto-generated method stub
		
	}
}
