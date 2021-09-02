import java.util.Arrays;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;

public class ArraySort{
	public static void main(String[] args){
		System.out.println("It's working");
		
		List<String> names = Arrays.asList("zayan", "shams", "maimu");		

		System.out.println("Before sort");
		System.out.println(names);
		
		// Prior to Java8
		/*Collections.sort(names, new Comparator<String>(){
			@Override
			public int compare(String a, String b){
				return a.compareTo(b);
			}
		});	*/
		
		// Using lambda expression		
		Collections.sort(names, (a, b)->a.compareTo(b));
		
		System.out.println("After sort");
		System.out.println(names);
		
	}

}
