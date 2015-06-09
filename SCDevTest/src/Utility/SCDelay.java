package Utility;

public class SCDelay {

	public static void forTime(int theTimeInSec){
		try {
			Thread.sleep(theTimeInSec*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
