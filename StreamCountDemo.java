import java.util.List;
import java.util.Arrays;
public class StreamCountDemo{
	public static void main(String[] args){
	
		System.out.println("It's working");
		
		List<String> names = Arrays.asList("Zayu", "Shams", "Maimu", "Monus");
		
		long count = names.stream().filter(s->s.startsWith("M")).count();
		
		System.out.println("count="+count);
	}
}
