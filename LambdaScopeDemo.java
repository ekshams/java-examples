import java.util.function.*;

@FunctionalInterface
interface Test{
	void one(int a);

}

public class LambdaScopeDemo{
	int num=1000;
	public static void main(String[] args){
		int tt=99;
		System.out.println("It's testing");
		Predicate<String> predicate = (s)->s.length() > 10;
		
		System.out.println(predicate.test("foo"));
		
		Test test = (a)->{
			LambdaScopeDemo lambdaScopeDemo = new LambdaScopeDemo();
			lambdaScopeDemo.num=10;			
			System.out.println("a+num="+a+lambdaScopeDemo.num);	

		};
		
		test.one(10);
		
		
	}

}
