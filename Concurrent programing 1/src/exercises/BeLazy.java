package exercises;

public class BeLazy {
	public static void doNothingForOneSecond(){
		try{
			Thread.sleep(200);
		}
		catch(InterruptedException e){
			
		}
	}
}
