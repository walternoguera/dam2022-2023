package caso1;

public class Professor extends Person { // herencia con extends
	private double salary;

	public Professor(String name, String phoneNumber, double salary) {
		super(name, phoneNumber);
		this.salary = salary;
	}

	@Override
	public void purchase() {
		// TODO Auto-generated method stub

	}
}
