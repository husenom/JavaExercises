package Question8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListToMap {

	public static void main(String[] args) {

		List<Student> students = new ArrayList<Student>();

		students.add(new Student(1, "Equar"));
		students.add(new Student(2, "Amanuel"));
		students.add(new Student(3, "Hawaz"));

		Map<Integer, String> toMap = new HashMap<>();

		for (Student stu : students) {
			toMap.put(stu.getId(), stu.getName());
		}

		System.out.println(toMap);

	}

}
