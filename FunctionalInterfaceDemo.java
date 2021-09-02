@FunctionalInterface
interface Sample{
	int test();
	default void one(){
		System.out.println("default method");
	}
}

public class FunctionalInterfaceDemo{
	public static void main(String[] args){
		System.out.println("It's working..");
		Sample s = ()->
		{
			System.out.println("sample interface-1");
			System.out.println("sample interface-2");
			return 100;
		};
		
		System.out.println("test="+s.test());
		s.one();
	}
}
