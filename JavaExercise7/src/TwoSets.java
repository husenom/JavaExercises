import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TwoSets {

	public static void main(String[] args) {
		
		// Question Number 2 (a)

				Set<Integer> set1 = new HashSet<>();
				Set<Integer> set2 = new HashSet<>();

				set1.add(3);
				set1.add(4);
				set1.add(5);
				set1.add(7);
				set1.add(8);
				set1.add(9);

				set2.add(5);
				set2.add(2);
				set2.add(4);
				set2.add(6);
				set2.add(7);
				set2.add(11);

				set1.retainAll(set2);
				System.out.println("The intersection of set1 and set2 is: " + set1);

				// Question Number 2 (b)

				Set<Integer> set3 = new HashSet<>();
				Set<Integer> set4 = new HashSet<>();
				
				set3.add(3);
				set3.add(4);
				set3.add(5);
				set3.add(7);
				set3.add(8);
				set3.add(9);

				set4.add(5);
				set4.add(2);
				set4.add(4);
				set4.add(6);
				set4.add(7);
				set4.add(11);

				set3.addAll(set4);
				System.out.println("The union of set1 and set2 is: " + set3);

				// Question Number 2 (c)

				Set<Integer> set5 = new HashSet<>();
				Set<Integer> set6 = new HashSet<>();

				set5.add(3);
				set5.add(4);
				set5.add(5);
				set5.add(7);
				set5.add(8);
				set5.add(9);

				set6.add(5);
				set6.add(2);
				set6.add(4);
				set6.add(6);
				set6.add(7);
				set6.add(11);

				Iterator<Integer> iter = set5.iterator();

				while (iter.hasNext()) {

					set6.remove(iter.next());
				}

				System.out.println("The unique elements in set2: " + set6);
	}

}
