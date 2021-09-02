import java.util.HashMap;
import java.util.ConcurrentModificationException;
class HashMapThreadTest{
	public static void main(String[] args){
		System.out.println("It's working..");
		
		HashMap<String, String> hashMap = new HashMap<>();
		hashMap.put("1", "one");
		hashMap.put("2", "two");
		hashMap.put("3", "three");
		
		try{
			for(Object item: hashMap.entrySet()){
			System.out.println(item);
			hashMap.put("4", "four");
		}						
		}catch(ConcurrentModificationException ex){
			System.out.println("Shouldn't modify the Hashmap after creating iterator");
		}		
	}
}
