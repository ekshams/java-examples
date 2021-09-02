/*
	Functional interface with generic example
*/

@FunctionalInterface
interface Converter<S, D>{
	D convert(S from);
}

public class FunctionalInterfaceGenericDemo{
	public static void main(String[] args){
		System.out.println("It's working");
		
		Converter<String, Integer> converter = Integer::valueOf;
		System.out.println("Converted value=" + converter.convert("123"));
		
	}

}
