package caso1;

public class Professor extends Person{
	private double salary;
	

	public Professor(String name, String phoneNumber, double salary) {
		super(name, phoneNumber);
		this.salary = salary;
	}

	@Override
	public boolean validate() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void print(String data) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void purchase() {
		// TODO Auto-generated method stub
		
	}
	
}
