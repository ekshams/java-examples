class Application{
	public static void main(String args[]){
		System.out.println("Program started...");
		Rectangle rectangleOne = new Rectangle();
		rectangleOne.moveTo();
		rectangleOne.draw(10, 20);
	}
}

abstract class GraphicObject{
	void moveTo(){
		System.out.println("moveTo method");
	}
	abstract void draw(int x, int y);
}

class Rectangle extends GraphicObject{
	void draw(int x, int y)	{
		System.out.println("draw method");
	}
}
