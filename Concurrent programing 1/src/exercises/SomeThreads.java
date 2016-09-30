package exercises;

public class SomeThreads {
	public static void main(String[] args){
		APCThread t1 = new APCThread(); 
		APCThread t2 = new APCThread(); 
		APCThread t3 = new APCThread(); 
		APCThread t4 = new APCThread(); 
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
}
