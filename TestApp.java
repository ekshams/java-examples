public class TestApp{
	public static void main(String... args){	
		/*for(int i=0; i<args.length;i++){
			System.out.println(i+"="+args[i]);
		}*/
		System.out.println("Main method..");
		Student zayu = new Student("zayan", 80);
		Student.setSchoolName("Izzath");		
		System.out.println("School="+ Student.getSchoolName()	);		
		System.out.println(zayu);
		Student maimu = new Student("maimu", 82);
		System.out.println(maimu);
		// Setting school name.
		
	}
}

class Student{
	private static String school;
	private String name;
	private int mark;
	public Student(String name, int mark){
		this.name = name;
		this.mark = mark;
	}
	public static String getSchoolName(){
		return Student.school;
	}
	public static void setSchoolName(String school){
		Student.school = school;
	}
	public void test(String... args){
		for(int i=0; i<args.length;i++){
			System.out.println(i+"="+args[i]);
		}
	}
	/*public String getName(){
		return this.name;
	}
	public int getMark(){
		return this.mark;
	}
	public void setName(String name){
		return this.name = name;
	}
	public void setMark(int mark){
		return this.mark = mark;
	}*/
	public String toString(){
		return "name:"+name+", mark:"+mark;
	}
}
