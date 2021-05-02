package assignment.week3;

public class Students {
	
	public void getStudentInfo(int id) {
		
		System.out.println("Department: Computer Science");

	}
	
	public void getStudentInfo(int id, String name) {
		
		System.out.println("Rank: 5");
	}
	
    public void getStudentInfo(String email, long phNum) {
		
		System.out.println("Qualification: M.Tech");
	}

	public static void main(String[] args) {
		
		Students info = new Students();
		info.getStudentInfo(10);
		info.getStudentInfo(23, "Harthi");
		info.getStudentInfo("harthi@gmail.com", 8765432456L);

	}

}
