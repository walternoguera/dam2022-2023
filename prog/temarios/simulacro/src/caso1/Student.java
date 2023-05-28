package caso1;

public class Student extends Person {
	private int studentNumber;
	private String averageMark;
	
	public Student(String name, String phoneNumber, int studentNumber, String averageMark) {
		super(name, phoneNumber);
		this.studentNumber = studentNumber;
		this.averageMark = averageMark;
	}
	
	public String getSeminars() {
		
		return "";
	}

	@Override
	public void purchase() {
		// TODO Auto-generated method stub
		
	}
}
