public class Test {

	public static void main(String args[]){
		SampleThread sampleThread = new SampleThread();
		System.out.println("Start the Thread.");
		Thread thread = new Thread(sampleThread);
		thread.start();
		System.out.println("Waiting for Thread End.");
	}

}

class SampleThread implements Runnable {

	public void run() {
		try{
			Thread.sleep(3000);
		}catch(Exception e){
			e.printStackTrace();
		}
		System.out.println("Thread executed.");
		System.out.println("End of the thread.");
	}


}
