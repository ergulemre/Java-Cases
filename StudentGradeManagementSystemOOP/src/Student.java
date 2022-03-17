import java.util.List;

public class Student {
	
	private int studentId;
	private int yearPeriod;
	private String studentName;
	private List<Integer> mathGrades;
	private List<Integer> physicsGrades;
	private List<Integer> chemistryGrades;
	
	Student(int id, int period, String name, List<Integer> mathGrades, List<Integer> physicsGrades, List<Integer> chemistryGrades){
		this.studentId=id;
		this.yearPeriod=period;
		this.studentName=name;
		this.mathGrades=mathGrades;
		this.physicsGrades=physicsGrades;
		this.chemistryGrades=chemistryGrades;
	}	
	
	public void setStudentGradesForActivePeriod(List<Integer> mathGrades, List<Integer> physicsGrades, List<Integer> chemistryGrades) {
		setYearPeriod(20202021);
		setMathGrades(mathGrades);
		setPhysicsGrades(physicsGrades);
		setChemistryGrades(chemistryGrades);		
	}
	
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public List<Integer> getMathGrades() {
		return mathGrades;
	}

	public void setMathGrades(List<Integer> mathGrades) {
		this.mathGrades = mathGrades;
	}

	public List<Integer> getPhysicsGrades() {
		return physicsGrades;
	}

	public void setPhysicsGrades(List<Integer> physicsGrades) {
		this.physicsGrades = physicsGrades;
	}

	public List<Integer> getChemistryGrades() {
		return chemistryGrades;
	}

	public void setChemistryGrades(List<Integer> chemistryGrades) {
		this.chemistryGrades = chemistryGrades;
	}

	public int getYearPeriod() {
		return yearPeriod;
	}

	public void setYearPeriod(int yearPeriod) {
		this.yearPeriod = yearPeriod;
	}
	
	@Override
    public String toString() {
		String math = mathGrades.stream().mapToDouble(d -> d).average().orElse(0.0) >=50 ? "success" : "fail";
        String physics = physicsGrades.stream().mapToDouble(d -> d).average().orElse(0.0) >=50 ? "success" : "fail";
        String chemistry = chemistryGrades.stream().mapToDouble(d -> d).average().orElse(0.0) >=50 ? "success" : "fail";
		
		return studentName + " : math course is " + math
				+ " and physics is " + physics
				+ " and chemistry is " + chemistry
				+ " in period " + String.valueOf(yearPeriod)
				+ "\n";
    }
}
