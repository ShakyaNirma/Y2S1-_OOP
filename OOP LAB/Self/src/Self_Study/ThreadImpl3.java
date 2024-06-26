package Self_Study;

class Sample{
	public void displayOutput(Sample sample) {
		synchronized(new Sample()) {
		try {
			for(int i=0;i<10;i++) {
				Thread.sleep(1000);
				System.out.println(Thread.currentThread().getName()+i);
			}
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
}

}


public class ThreadImpl3 extends Thread{
	
	Sample sample;
	String name;
	public static final String THREAD0="Thread 0";
	public static final String THREAD1="Thread 1";
	
	public ThreadImpl3(Sample sample,String name) {
		this.sample=sample;
		this.name=name;
	}
	
	

	public static void main(String[] args) {
		Sample sample=new Sample();
		ThreadImpl3 threadim1=new ThreadImpl3(sample, THREAD0);
		ThreadImpl3 threadim2=new ThreadImpl3(sample, THREAD1);
		threadim1.start();
		threadim2.start();
	}
	public void run() {
		sample.displayOutput(sample);
	}

}

