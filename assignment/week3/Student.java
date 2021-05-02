package assignment.week3;

public class Student extends Department {

	public void studentName() {
		System.out.println("Harthi Gnanavel");

	}
	
	public void studentDept() {
		System.out.println("Computer Scince");

	}
	
	public void studentId() {
		System.out.println("10T09475");

	}
	public static void main(String[] args) {
		
		Student obj = new Student();
		obj.studentName();
		obj.studentDept();
		obj.studentId();
		
		obj.deptName();
		
		obj.collegeName();
		obj.collegeCode();
		obj.collegeRank();
		
		
	}

}
