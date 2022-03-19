import java.util.List;

public class School{
	
	private List<Courses> courses;
    private List<Student> passiveYearStudents;
    private List<Student> activeYearStudents;
    
    public School(List<Courses> courses, List<Student> passiveYearStds, List<Student> activeYearStds) {
    	this.courses=courses;
    	this.passiveYearStudents=passiveYearStds;
    	this.activeYearStudents=activeYearStds;
    }

	public List<Courses> getCourses() {
		return courses;
	}

	public void setCourses(List<Courses> courses) {
		this.courses = courses;
	}

	public List<Student> getPassiveYearStudents() {
		return passiveYearStudents;
	}

	public void setPassiveYearStudents(List<Student> passiveYearStudents) {
		this.passiveYearStudents = passiveYearStudents;
	}

	public List<Student> getActiveYearStudents() {
		return activeYearStudents;
	}

	public void setActiveYearStudents(List<Student> activeYearStudents) {
		this.activeYearStudents = activeYearStudents;
	}
	
	@Override
    public String toString() {
        return String.valueOf(courses)
        		+ "\n"
			    + String.valueOf(activeYearStudents.toString())
			    + "\n" 
			    + String.valueOf(passiveYearStudents.toString());
    }
}
