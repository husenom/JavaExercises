import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EvenNumberList {

	public static void main(String[] args) {
		
		// Question (a)

		List<Integer> myList = new ArrayList<>();

		myList.add(1);
		myList.add(2);
		myList.add(4);
		myList.add(4);
		myList.add(5);
		myList.add(5);

		for (int i = 0; i < myList.size(); i++) {
			if (myList.get(i) % 2 == 0) {
				myList.remove(i);
			}
		}

		System.out.println(myList);
		
		// Question (b)
		
		List<Integer> myList2 = new ArrayList<>();
		
		myList2.add(1);
		myList2.add(2);
		myList2.add(4);
		myList2.add(4);
		myList2.add(5);
		myList2.add(5);
		
		Iterator<Integer> iter = myList2.iterator();

		while(iter.hasNext())
		{
			if (iter.next()%2 ==0)
				iter.remove();
		}

		System.out.println(myList2);

	}

	
}

