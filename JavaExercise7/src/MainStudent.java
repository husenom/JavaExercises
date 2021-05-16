import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainStudent {

	public static void main(String[] args) {
		
		List<Student> students = new ArrayList<>();
		
		students.add(new Student("Hagos", 20));
		students.add(new Student("Zeray", 18));
		students.add(new Student("Tirhas", 25));
		students.add(new Student("Seble", 23));
		
		System.out.println("students name sorted by alphabet");
		
		Collections.sort(students);
		
		for(Student str: students) {
			System.out.println(str);
			
		}
		
	}

}
