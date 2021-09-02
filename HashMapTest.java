import java.util.*;
public class HashMapTest{
	public static void main(String... args){
		System.out.println("hiiii");
		Map<String, String> myMap = new HashMap<>();
		myMap.put("one","apple");
		myMap.put("two","orange");
		myMap.put("three","grape");
		myMap.put("four","pineapple");
		
		for(Map.Entry<String, String> entry: myMap.entrySet()){
				System.out.println("Key="+entry.getKey()+", Value="+entry.getValue());
		}

	}
	
}
