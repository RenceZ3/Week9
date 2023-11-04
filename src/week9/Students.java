package week9;

public class Students {
	String fname, lname, collegeLocation, courseName;
	double grades;
	int units;
	int courseID;
	
	
	Students(String fname, String lname, double grades, int units) {
		this.fname = fname;
		this.lname = lname;
		this.grades = grades;
		this.units = units;
	}
	
	Students(String fname, String lname) {
		this.fname = fname;
		this.lname = lname;
	}
	
	Students(String fname, String lname, int courseID) {
		this.fname = fname;
		this.lname = lname;
		this.courseID = courseID;
	}
	
	Students(int courseID, String courseName, String collegeLocation) {
		this.courseID = courseID;
		this.courseName = courseName;
		this.collegeLocation = collegeLocation;
	}
	
	public String studentName() {
		return fname + " " + lname;
	}

	@Override
	public String toString() {
		return "\nDETAILS ABOUT STUDENT"
				+ "\n ==================================\n"
				+ "Course ID: " + courseID +"\n"
						+ "Course Name:  "+ courseName + "\n"
								+ "College Location: " + collegeLocation+"\n";
	}
	
	

}
