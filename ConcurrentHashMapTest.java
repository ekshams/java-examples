import java.util.concurrent.ConcurrentHashMap;

class ConcurrentHashMapTest{
	public static void main(String args[]){
		System.out.println("It's working");
		
		// Declare ConcurrentHashMap
		ConcurrentHashMap<Integer, String> concurrentHashMap = new ConcurrentHashMap<>();
		concurrentHashMap.put(1, "One");
		concurrentHashMap.put(2, "Two");
		
		for(Object item: concurrentHashMap.entrySet()){
			System.out.println(item);
			concurrentHashMap.put(3, "Three");
		}		
	}
}
