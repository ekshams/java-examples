public class IntefaceTest implements MyInterface{
	public static void main(String... args){
		System.out.println("hiiii");

	}
	@Override
	public void myAbstractMethod(){
		System.out.println("hiiii--override");
	}
}

interface MyInterface{
	default void myDefaultMethod(){
		System.out.println("my method - interface");
	}
	void myAbstractMethod();
}
