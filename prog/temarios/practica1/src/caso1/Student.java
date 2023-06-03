package caso1;

public class Student extends Person {
	private int studentNumber;
	private String averageMark;
	private String getSeminars;
	public Student(String name, String phoneNumber, int studentNumber, String averageMark, String getSeminars) {
		super(name, phoneNumber);
		this.studentNumber = studentNumber;
		this.averageMark = averageMark;
		this.getSeminars = getSeminars;
	}
	public int getStudentNumber() {
		return studentNumber;
	}
	public void setStudentNumber(int studentNumber) {
		this.studentNumber = studentNumber;
	}
	public String getAverageMark() {
		return averageMark;
	}
	public void setAverageMark(String averageMark) {
		this.averageMark = averageMark;
	}
	public String getGetSeminars() {
		return getSeminars;
	}
	public void setGetSeminars(String getSeminars) {
		this.getSeminars = getSeminars;
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
