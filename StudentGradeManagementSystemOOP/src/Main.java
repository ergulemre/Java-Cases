import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		Courses course1 = new Courses("mathematics", 50.0);
		Courses course2 = new Courses("physics", 50.0);
		Courses course3 = new Courses("chemistry", 50.0);
		
		List<Courses> courseList = new ArrayList<>();
		courseList.add(course1);
		courseList.add(course2);
		courseList.add(course3);

		Student passiveYearStudent1 = new Student(1, 20192020, "Emre", Arrays.asList(73,83), Arrays.asList(74,84), Arrays.asList(75,85));
		Student passiveYearStudent2 = new Student(2, 20192020, "Koray", Arrays.asList(72,82), Arrays.asList(73,83), Arrays.asList(74,84));
		Student passiveYearStudent3 = new Student(3, 20192020, "Mehmet", Arrays.asList(71,81), Arrays.asList(72,82), Arrays.asList(73,83));
		
		List<Student> studentListOfPassivePeriod = new ArrayList<>();
		studentListOfPassivePeriod.add(passiveYearStudent1);
		studentListOfPassivePeriod.add(passiveYearStudent2);
		studentListOfPassivePeriod.add(passiveYearStudent3);
		
		Student activeYearStudent1 = new Student(1, 20202021, "Emre", Arrays.asList(10,83), Arrays.asList(74,84), Arrays.asList(75,85));
		Student activeYearStudent2 = new Student(2, 20202021, "Koray", Arrays.asList(72,82), Arrays.asList(73,83), Arrays.asList(74,84));
		Student activeYearStudent3 = new Student(3, 20202021, "Mehmet", Arrays.asList(71,81), Arrays.asList(11,82), Arrays.asList(73,83));
		
		List<Student> studentListOfActivePeriod = new ArrayList<>();
		studentListOfActivePeriod.add(activeYearStudent1);
		studentListOfActivePeriod.add(activeYearStudent2);
		studentListOfActivePeriod.add(activeYearStudent3);
		
		School school = new School(courseList, studentListOfPassivePeriod, studentListOfActivePeriod);
		
		System.out.println(school);
		
	}

}
