
public class Courses {
	public String courseName;
	public Double minPassingGrade;
	
	public Courses(String name, Double minPassingGrade) {
		this.courseName=name;
		this.minPassingGrade=minPassingGrade;
	}
	
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public Double getMinPassingGrade() {
		return minPassingGrade;
	}
	public void setMinPassingGrade(Double minPassingGrade) {
		this.minPassingGrade = minPassingGrade;
	}
	
	@Override
    public String toString() {
        return courseName + " course avarage passing grade : "+ String.valueOf(minPassingGrade) + "\n";
    }
	
}
