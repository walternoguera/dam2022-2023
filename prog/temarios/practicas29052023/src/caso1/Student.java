package caso1;

public abstract class Student extends Person{
	private int studentNumber;
	private String averageMark;
	public Student(String name, String phoneNumber, int studentNumber, String averageMark) {
		super(name, phoneNumber);
		this.studentNumber = studentNumber;
		this.averageMark = averageMark;
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
	
	public String getSeminars() {
		return "";
	}
	@Override
	public void pruchase() {
		// TODO Auto-generated method stub
		
	}
}
