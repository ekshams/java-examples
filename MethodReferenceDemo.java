/*
	Method reference example
*/

@FunctionalInterface
interface Converter<F, T>{
	T convert(F from);
}

class Something{
	String startWith(String s){
		return String.valueOf(s.charAt(0));
	}

}

public class MethodReferenceDemo{
	public static void main(String[] args){
		System.out.println("It's working");
		Something something = new Something();
		Converter<String, String> converter = something::startWith;
		
		System.out.println(converter.convert("Test"));
		
	}

}
