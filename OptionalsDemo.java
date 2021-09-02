import java.util.Optional;
public class OptionalsDemo{
	public static void main(String[] args){
		System.out.println("It's working..");
		 Optional<String> optional = Optional.of("boo");
		 System.out.println(optional.isPresent());
		 System.out.println(optional.get());
		 optional.ifPresent((s)->System.out.println(s.charAt(0)));
		
	}
}
