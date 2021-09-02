/*
Stream examples
*/

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample{
	public static void main(String[] args){	
		System.out.println("It's working..\n");
		
		// Initialize name list
		List<String> names = Arrays.asList("Zayan", "Shams", "Maimu", "Sonu", "Monu", "See","Lee");
		
		// Display using stream.
		//names.stream().forEach(System.out::println);
		
		// Using filter
		//names
		//.stream()
		//.filter((s)->s.startsWith("M"))
		//.forEach(System.out::println);
		
		
		// Sorted
		/*names
		.stream()
		.sorted()
		.filter(x->x.startsWith("Z")|| x.startsWith("S"))
		.forEach(System.out::println);*/
		
		// Map
/*		names
		.stream()
		.map(String::toUpperCase)
		.sorted((a,b)->b.compareTo(a))
		.forEach(System.out::println);*/
		
List<String> res = 		names
		.stream()
		.map(String::toUpperCase)
		.sorted((a,b)->a.compareTo(b))
		.collect(Collectors.toList());
		
		System.out.println(res);
		
	boolean anyStartsWithA = 
	names
	.stream()
	.anyMatch((s)->s.toLowerCase().startsWith("z"));
	
		System.out.println(anyStartsWithA);	
		
	}

}
