public class HelloRunnable implements Runnable{
	public void run(){
		System.out.println("HelloRunnable run..");
		System.out.println("Thread name:"+ Thread.currentThread().getName());
		
	}
	public static void main(String args[]){
	Thread t1 = new Thread(new HelloRunnable());
		t1.setName("newThread");
		t1.start();
		System.out.println("Thread name:"+ Thread.currentThread().getName());
	}
}
